import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String firstLower = firstString.toLowerCase();
        String secondLower = secondString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
        String secondUpper = secondString.toUpperCase();

        boolean isEqualIgnoreCase = firstLower.equals(secondLower);

        System.out.println("\nConverted Strings:");
        System.out.println("First String (Lowercase): " + firstLower);
        System.out.println("Second String (Lowercase): " + secondLower);
        System.out.println("First String (Uppercase): " + firstUpper);
        System.out.println("Second String (Uppercase): " + secondUpper);
        System.out.println("\nCase-insensitive Equality Comparison Result: " + isEqualIgnoreCase);

        scanner.close();
    }
}

