//O(n),O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // start filling from last index of nums1
        int last = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        // fill left over ele from nums2
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }

    }
}
