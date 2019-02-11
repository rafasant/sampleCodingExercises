public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int Sum) {
        if ((firstNumber + secondNumber) == Sum) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
