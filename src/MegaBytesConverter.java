public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(2054);
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int restKilo = kiloBytes % 1024;

        if (kiloBytes >= 0){
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + restKilo + "KB");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
