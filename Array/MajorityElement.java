public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int candidate = findCandidate(nums);
        if (isMajority(nums, candidate)) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found.");
        }
    }

    private static int findCandidate(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    private static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count > nums.length / 2;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
