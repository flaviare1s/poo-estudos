package exercicio03_relogio;

public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        switch (clock) {
            case USClock usClock -> {
                int convertedHour = usClock.getPeriodIndicator().equals("PM") && usClock.getHour() < 12
                        ? usClock.getHour() + 12
                        : (usClock.getHour() == 12 && usClock.getPeriodIndicator().equals("AM") ? 0 : usClock.getHour());

                this.setHour(convertedHour);
                this.setMinute(usClock.getMinute());
                this.setSecond(usClock.getSecond());

                return this;
            }

            case BRLClock brlClock -> {
                this.setHour(brlClock.getHour());
                this.setMinute(brlClock.getMinute());
                this.setSecond(brlClock.getSecond());
                return this;
            }

            default -> throw new IllegalArgumentException("Clock type not supported");
        }
    }
}
