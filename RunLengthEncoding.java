public class RunLengthEncoding {
    public static String encode(String str) {
        StringBuilder encodedStr = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            encodedStr.append(str.charAt(i)).append(count);
        }
        return encodedStr.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbcccaaa";
        String encoded = encode(input);
        System.out.println("Encoded String: " + encoded);
    }
}
