public class MergeShortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set pointers for nums1 and nums2
        int p1 = m - 1, p2 = n - 1;
        // Set pointer for nums1 to place merged elements
        int p = m + n - 1;

        // Merge nums1 and nums2, starting from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are still elements in nums2, add them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
