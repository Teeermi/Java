public class CodingExercise6 {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int valueOne = (int) (one * 1000);
        int valueTwo = (int) (two * 1000);

        if (valueOne == valueTwo) {
            return true;
        } else {
            return false;
        }


    }
}
