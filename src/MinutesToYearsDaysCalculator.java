public class MinutesToYearsDaysCalculator {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);

    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else if (minutes >= 0) {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDays = day % 365;

            System.out.println(minutes + " min" + " = " + year + " y and " + remainingDays + " d");
        }
    }
}
