public class CodingExercise8 {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int one, int two, int three) {
        if ((one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int one) {
        if(one >= 13 && one <= 19) {
            return true;
        } else {
            return false;
        }
    }


}
