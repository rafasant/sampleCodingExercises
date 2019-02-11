public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(59, 40));
        System.out.println(getDurationString(50000));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0) || (seconds >59)) {
            return "Invalid value";
        }

        long hour = minutes / 60;
        long remainingMinutes = minutes % 60;

        return hour + "h " +remainingMinutes + "m " + seconds + "s";
    }

     public static String getDurationString(long seconds) {
         if (seconds < 0) {
             return "Invalid value";
         }
         long minutes = seconds / 60;
         long remainingSeconds = seconds % 60;

         return getDurationString(minutes, remainingSeconds);
     }
}
