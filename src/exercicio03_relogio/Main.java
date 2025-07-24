package exercicio03_relogio;

public class Main {
    public static void main(String[] args) {
        USClock usClock = new USClock();
        usClock.setHour(15);
        usClock.setMinute(45);
        usClock.setSecond(30);

        System.out.println("USClock:");
        System.out.println(usClock.getHour() + ":" + usClock.getMinute() + ":" + usClock.getSecond() + " " + usClock.getPeriodIndicator());

        BRLClock brlFromUS = new BRLClock();
        brlFromUS.convert(usClock);

        System.out.println("BRLClock:");
        System.out.println(brlFromUS.getHour() + ":" + brlFromUS.getMinute() + ":" + brlFromUS.getSecond());

        BRLClock brlClock = new BRLClock();
        brlClock.setHour(0);
        brlClock.setMinute(10);
        brlClock.setSecond(5);

        System.out.println("\nBRLClock:");
        System.out.println(brlClock.getHour() + ":" + brlClock.getMinute() + ":" + brlClock.getSecond());

        USClock usFromBRL = new USClock();
        usFromBRL.convert(brlClock);

        System.out.println("USClock:");
        System.out.println(usFromBRL.getHour() + ":" + usFromBRL.getMinute() + ":" + usFromBRL.getSecond() + " " + usFromBRL.getPeriodIndicator());
    }
}
