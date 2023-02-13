package arrayExercises;

public class SumOfElements {
    public static int sumOfNumber(int[] tabex) {
        int sum = 0;
        for (int i = 0; i < tabex.length; i++) {
            sum += tabex[i];
        }
        return sum;
    }
}
