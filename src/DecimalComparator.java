public class DecimalComparator {
    public static void main(String[] args) {
       areEqualByThreeDecimalPlaces(-3.1756, -3.175);
       areEqualByThreeDecimalPlaces(3.175, 3.176);
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstDecimal, double secondDecimal) {
        firstDecimal = (int) (firstDecimal * 1000);
        secondDecimal = (int) (secondDecimal * 1000);

        if (firstDecimal == secondDecimal) {
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }

}
