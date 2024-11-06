public class challenge {
    public static void main(String[] args) {
        double one = 20.00;
        double two = 80.00;
        double three = (one + two) * 100.00;
        double four = three % 40;
        boolean five = four == 0.00 ? true : false;

        if (!five) {
            System.out.println("get some remainder");
        }

    }
}
