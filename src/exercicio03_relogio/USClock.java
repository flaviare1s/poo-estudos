package exercicio03_relogio;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterNoon() {
        this.periodIndicator = "PM";
    }

    public void setBeforeNoon() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        if (hour > 12 && hour <=23) {
            setAfterNoon();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            setBeforeNoon();
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        this.setSecond(clock.getSecond());
        this.setMinute(clock.getMinute());

        return null;
    }
}
