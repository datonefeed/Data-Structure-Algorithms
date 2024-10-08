public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        
        if (n < 0) {
            return false;
        }

        int original = n; 
        int reversed = 0; 

        
        while (n != 0) {
            int digit = n % 10; 
            reversed = reversed * 10 + digit; 
            n /= 10; 
        }

        
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " là số palindrome.");
        } else {
            System.out.println(num + " không phải là số palindrome.");
        }
    }
}
