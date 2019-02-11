import java.util.Arrays;

public class movingCharacter {
    public static void main(String[] args) {

        int[] crunchfyData;
        crunchfyData = new int[] {10, 9, 2, 3, 0, 3, 4, 0, 1, 3, 0, 5, 0};

        System.out.println("Original array: " + Arrays.toString(crunchfyData));

        if (crunchfyData == null || crunchfyData.length == 0) {
            System.out.println("empty");
        }
        quickSort(crunchfyData);
    }

    public static void quickSort(int[] crunchifyData) {
        int j = 0;
        for (int i = 0; i < crunchifyData.length; i++) {
            if (crunchifyData[i] != 0) {
                int temp = crunchifyData[j];
                crunchifyData[j] = crunchifyData[i];
                crunchifyData[i] = temp;
                j++;
            }
        }
        System.out.println("\nResult: " + Arrays.toString(crunchifyData));
    }
}
