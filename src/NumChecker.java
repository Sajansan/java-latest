public class NumChecker {
    public static boolean isEven(int number) {
        int result = number % 2;
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean r = isEven(6);
        boolean r1 = isEven(9);
        System.out.println(r);
        System.out.println(r1);
    }
}
