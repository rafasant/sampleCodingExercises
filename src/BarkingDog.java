public class BarkingDog {
    public static void main(String[] args) {
       bark(true, 4);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking) {
            if(hourOfDay < 0 || hourOfDay > 23) {
                System.out.println("False");
                return false;
            }else if(hourOfDay < 8 || hourOfDay > 22) {
                System.out.println("True");
                return true;
            }else {
                System.out.println("False");
                return false;
            }
        }else {
            System.out.println("False");
        }
        return false;
    }
}
