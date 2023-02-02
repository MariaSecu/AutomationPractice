package arrayExercises;

public class ExecutionArray {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 7};
        System.out.println("The max elements is: " + ArraysPractice.findMaxArray(array));
        System.out.println("The minimum elements is: " + ArraysPractice.getMinArray(array));
        System.out.println("The average of array is: " + ArraysPractice.calculateSum(array));
        System.out.println("The sum of array elents are: " + SumOfElements.sumOfNumber(array));
    }
}
