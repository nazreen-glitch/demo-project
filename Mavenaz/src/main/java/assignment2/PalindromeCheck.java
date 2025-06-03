package assignment2;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner display = new Scanner ();

      
        System.out.print("Enter a string: ");
        String input = display.nextLine();

        
        String str = input.toLowerCase().replaceAll("\\s+", "");

      
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

      
        if (str.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        display.close();
    }
}

