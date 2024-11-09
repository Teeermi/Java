public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,6));
    }

    public static double convertToCentimeters(int inch) {
        return inch * 2.54;
    }

    public static double convertToCentimeters(int feet, int inch) {
        return convertToCentimeters((feet * 12) + inch);
    }

}
