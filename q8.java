import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatenatedStringMethod = firstString.concat(secondString);
        String concatenatedStringOperator = firstString + secondString;

        System.out.println("\nConcatenated String (Using concat method): " + concatenatedStringMethod);
        System.out.println("Concatenated String (Using + operator): " + concatenatedStringOperator);

        System.out.print("\nEnter an index number to retrieve character: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < concatenatedStringMethod.length()) {
            char characterAtIndex = concatenatedStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the range of the concatenated string.");
        }

        scanner.close();
    }
}

