public class Palindromechecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management system");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully");
        System.out.println("________________________________");
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0;i < input.length()/2;i++) {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;

            }
        }
        System.out.println("Input text:" + input);
        System.out.println("Is it a Palindrome?:" + isPalindrome);

    }
}