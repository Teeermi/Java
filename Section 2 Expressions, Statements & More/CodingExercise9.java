public class CodingExercise9 {
    public static void main(String[] args) {
        System.out.println(area(-2));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return (radius * radius) * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return (x * y);
        }
    }


}
