public class CodingExercise10 {
    public static void main(String[] args) {
printYearsAndDays(527040);
    }

    public static void printYearsAndDays(long minutes) {
        long year = minutes / 60 / 24;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " +  year / 365 + " y and " + year % 365 + " d");
        }
    }



}
