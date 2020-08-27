import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean bLoop = true;
    double num1, num2, output;
    char op = ' ';
    Scanner s1 = new Scanner(System.in);
    String input;
    // Prints a welcome statement to the console
    System.out.println("Welcome to this consle calculator app!");

    while (bLoop){

      

      // Asks user for first number and saves the input as a numeric variable
      System.out.println("Please input the first number");
      num1 = s1.nextDouble();

      // Asks user for an operator ( +, -, *, or /)
      System.out.println("Please input the operator");
      op = s1.next().charAt(0);

      // Asks user for second number and saves the input as a numeric variable
      System.out.println("Please input the second number");
      num2 = s1.nextDouble();

      // calculation
      switch (op){
        case '+':
          output = num1 + num2;
          break;
        case '-':
          output = num1 - num2;
          break;
        case '*':
          output = num1 * num2;
          break;
        case '/':
          output = num1 / num2;
          break;
        default:
          System.out.println("ERROR: Invalid operator. Output set to 0 (default)\n");
          output = 0;
          break;
      }

      // Prints the answer in the console
      System.out.println("Your function is: " + num1 + ' ' + op + ' ' + num2);
      System.out.println("The answer is: " + output);

      // Asks user if they would like to perform another calculation
      System.out.println("Would you like to perform another calculation? (y/n)");
      bLoop = (s1.next().charAt(0) == 'y');
    }
    s1.close();
  }
}
