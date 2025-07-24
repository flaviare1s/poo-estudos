package exercicio03_relogio;

public sealed abstract class Clock permits BRLClock, USClock {
    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24 || hour < 0) {
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60 || minute < 0) {
            this.minute = 0;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60 || second < 0) {
            this.second = 0;
            return;
        }
        this.second = second;
    }

    abstract Clock convert(Clock clock);
}
