public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(time(60, 10));
    }


    public static String time(int seconds) {
        return (seconds / 60) / 60 + "h " + (seconds / 60) % 60 + "m " + seconds % 60 + "s";
    }

    public static String time(int minutes, int seconds) {
        seconds = seconds + minutes * 60;
        return (seconds / 60) / 60 + "h " + (seconds / 60) % 60 + "m " + seconds % 60 + "s";
    }

}
