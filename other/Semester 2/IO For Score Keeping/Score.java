import java.time.LocalTime;

public class Score {
    public String name;
    public String date;
    public String duration;
    public String attempts;

    public Score(String name, String date, String duration, String attempts) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.attempts = attempts;
    }
}
