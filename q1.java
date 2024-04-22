public class q1 {
    public static void main(String[] args) {
        // Using String literals
        String str1 = "hello";
        String str2 = "hello";

        // Using new keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Checking memory addresses
        System.out.println("Memory addresses using String literals:");
        System.out.println("str1 address: " + System.identityHashCode(str1));
        System.out.println("str2 address: " + System.identityHashCode(str2));

        System.out.println("\nMemory addresses using new keyword:");
        System.out.println("str3 address: " + System.identityHashCode(str3));
        System.out.println("str4 address: " + System.identityHashCode(str4));

        // String comparison
        System.out.println("\nString comparison using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        System.out.println("\nString comparison using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
    }
}

