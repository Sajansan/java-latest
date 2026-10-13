public class Main {
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int result = calculateArea(6, 10);
        System.out.println("Area of rectangle: " + result);
    }
}