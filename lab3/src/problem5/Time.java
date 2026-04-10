package problem5;


public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time() {}

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        }
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid minute");
        }
        if (second < 0 || second > 59) {
            System.out.println("Invalid second");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour; 

        if (h == 0) h = 12;

        if (h > 12) {
            return String.format("%02d:%02d:%02d PM", h - 12, minute, second);
        } else {
            return String.format("%02d:%02d:%02d AM", h, minute, second);
        }
    }

    public void add(Time t) {
        int totalSeconds =
                this.second + t.second +
                60 * (this.minute + t.minute) +
                3600 * (this.hour + t.hour);

        this.hour = (totalSeconds / 3600) % 24; 
        totalSeconds %= 3600;
        this.minute = totalSeconds / 60;
        this.second = totalSeconds % 60;
    }

    
    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour)
            return this.hour - other.hour;

        if (this.minute != other.minute)
            return this.minute - other.minute;

        return this.second - other.second;
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}