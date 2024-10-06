public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        // Nếu số âm thì không thể là palindrome
        if (n < 0) {
            return false;
        }

        int original = n; // Lưu lại giá trị ban đầu của n
        int reversed = 0; // Khởi tạo số đảo ngược

        // Đảo ngược số
        while (n != 0) {
            int digit = n % 10; // Lấy chữ số cuối
            reversed = reversed * 10 + digit; // Xây dựng số đảo ngược
            n /= 10; // Loại bỏ chữ số cuối cùng
        }

        // So sánh số gốc và số đảo ngược
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
