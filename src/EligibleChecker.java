public class EligibleChecker {
    public static String checkEligibility(int age) {
        if (age >= 18) {
            return "Eligible to vote";
        } else {
            return "Not fucking eligible to vote";
        }
    }

    public static void main(String[] args) {
        String result = checkEligibility(19);
        String result1 = checkEligibility(16);
        System.out.println(result);
        System.out.println(result1);
    }
}
