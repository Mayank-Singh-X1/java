import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate total and percentage of 5 subjects
        System.out.println("Enter the marks of 5 subjects:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        float total = a + b + c + d + e;
        float percentage = (total / 500) * 100;

        System.out.println("Your total is: " + total);
        System.out.println("Your total percentage is: " + percentage + "%");

        // Print a 2D array
        int[3][3] array = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}