public class TeenNumberChecker {
    public static void main(String[] args) {
       hasTeen(9, 99, 19);
       hasTeen(23, 15, 42);
       hasTeen(22, 23, 34);
       hasTeen(10, 14, 55);

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        if(firstAge >= 13 && firstAge <= 19) {
            System.out.println("True");
            return true;
        } else if(secondAge >= 13 && secondAge <= 19){
            System.out.println("True");
            return true;
        } else if(thirdAge >= 13 && thirdAge <= 19){
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
