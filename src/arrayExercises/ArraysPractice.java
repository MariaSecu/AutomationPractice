package arrayExercises;

public class ArraysPractice {

    public static int findMaxArray(int[] table) {
        int max = table[0];
        for (int i = 0; i < table.length; i++) {
            if (table[i] > max) {
                max = table[i];
            }
        }
        return max;
    }

    public static int getMinArray(int[] table) {
        int min = table[0];
        for (int i = 0; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
            }
        }
        return min;
    }

    public static int calculateSum(int[] table) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
            avg = sum / table.length;
        }
        return avg;

    }

}
