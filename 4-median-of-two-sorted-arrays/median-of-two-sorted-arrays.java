class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length, n = nums2.length;
        int half = (m + n + 1) / 2;
        int lo = 0, hi = m;

        while (lo <= hi) {
            int i = (lo + hi) / 2;
            int j = half - i;

            int left1  = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int right1 = (i < m) ? nums1[i]     : Integer.MAX_VALUE;
            int left2  = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n) ? nums2[j]      : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                int maxLeft  = Math.max(left1, left2);
                int minRight = Math.min(right1, right2);

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                } else {
                    return (maxLeft + minRight) / 2.0;
                }

            } else if (left1 > right2) {
                hi = i - 1;
            } else {
                lo = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}