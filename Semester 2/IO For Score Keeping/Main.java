import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;
import java.util.Date;
import java.time.ZonedDateTime;

class Main {
  public static void main(String[] args) throws IOException {
    Random random = new Random();
    int randNum = random.nextInt(99) + 1;
    int guess = 0;
    int attempts = 0;
    Scanner cin = new Scanner(System.in);
    Scanner scoresIn = new Scanner(new File("scores.txt")); // format is    [name] [date] [duration] [attempts]
    String fileName = "scores.txt";
    FileWriter scoresOut = new FileWriter(fileName, true);
    ArrayList<Score> scores = new ArrayList<Score>();
    Date date = new Date();

    while (scoresIn.hasNext()) {
         scores.add(new Score(scoresIn.next(), scoresIn.next(), scoresIn.next(), scoresIn.next()));
    }

    Score highscore = scores.get(0);
    for (Score s : scores) {
        if (Integer.parseInt(s.duration) == Integer.parseInt(highscore.duration)) {
            if (Integer.parseInt(s.attempts) < Integer.parseInt(highscore.attempts)) {
                highscore = s;
            }
        } else if (Integer.parseInt(s.duration) < Integer.parseInt(highscore.duration)) {
            highscore = s;
        }
    }


    System.out.println("Welcome to the guessing game!");
    System.out.println("Highscore is: " + highscore.duration);
    while (0 == 0) {
        System.out.println("Please enter your name: ");
        String name = cin.nextLine();
        long sTime = date.getTime();
        System.out.println("Start time: " + sTime);

        System.out.print("Guess a number (between 1 and 100): ");
        guess = cin.nextInt();
        while(guess != randNum){
            if(randNum > guess){
                System.out.print("Your guess was too low, try again: ");
                guess = cin.nextInt();
            }
            else if(randNum < guess){
                System.out.print("Your guess was too high, try again: ");
                guess = cin.nextInt();
            }
            attempts++;
        }

        Date dateEnd = new Date();
        long eTime = dateEnd.getTime();
        long duration = eTime - sTime;
        String stringDate = date.toString().replace(' ','/');

        scoresOut.write('\n' + name + '\t' + stringDate + '\t' + duration + '\t' + attempts);
        scoresOut.flush();

        System.out.println("\nCongradulations! here are some of your stats: ");
        System.out.println("Name: " + name);
        System.out.println("Date: " + stringDate);
        System.out.println("Duration: " + duration + " milliseconds");
        System.out.println("Attempts: " + attempts);

        System.out.println("\nWould you like to play again? (y/n)");
        string input = cin.next();
        if (input == "y") {
            break;
        }
    }
    scoresOut.close();
  }
}

// Welcome message and instructions for gameplay
// Print the line from the scores.txt with the smallest duration
// Require the user's first name before the game starts as a string
// Saves the DateTime when the game begins (choose datatype wisely, should be accurate to the milli)
// Keeps the user guessing until the numbers match (no change)
// Saves the DateTime when the game ends (again choose datatype wisely, should be accurate to the milli)
// When the 'win' occurs, a text file called scores.txt will be appended with a new line separated by tab (\t):
// Name
// Date (when the win occurs formatted as DD/MM/YYYY)
// Duration (in millis)
// Attempts
// The user will be given the option to replay
