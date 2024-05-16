import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();
        System.out.print("Enter a word to replace it with: ");
        String replaceWord = scanner.nextLine();

        int index = sentence.indexOf(searchWord);

        String modifiedSentence = sentence.substring(0, index) + replaceWord + sentence.substring(index + searchWord.length());

        System.out.println("\nOriginal Sentence: " + sentence);
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }
}

