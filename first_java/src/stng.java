import java.util.Arrays;
public class stng {
public static void main(String[] args) {
// Initialize a sorted array
int[] numbers = {1, 2, 5, 7, 8};
// Perform binary search for the value 7
int index = Arrays.binarySearch(numbers, 7);
// Print the index of the value 7
System.out.println("Index of 7: " + index); // Outputs: Index of 7: 3
}
}