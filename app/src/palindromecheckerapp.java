public class palindromecheckerapp {

    // Main method - Entry point
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        // Program end message
        System.out.println("Program execution completed.");
    }
}