package info.victorchu.all.q4;

public class MedianOfTwoSortedArrays {
    // nums1 = [-1,1,3,5,7,9]
    // nums2 =[2,4,6,8,10,12,14,16]
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("arrays must not all empty");
        }
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int k = (n1 + n2 + 1)/2; // 数组1和数组2长度的中位数
        int left = 0;
        int right = n1;
        while(left < right){ // 二分查找 nums1
            int m1 = left +(right - left)/2;
            int m2 = k - (m1+1); // num2 的约束

            if (nums1[m1] < nums2[m2])
                left = m1 + 1;
            else
                right = m1;
        }
        int m1 = left;
        int m2 = k - left;
        int c1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1-1],
                m2 <= 0 ? Integer.MIN_VALUE : nums2[m2-1]);
        if ((n1 + n2) % 2 == 1) { // 奇数
            return c1;
        }
        int c2 = Math.min( m1 >= n1 ? Integer.MAX_VALUE :nums1[m1],
                m2 >= n2 ? Integer.MAX_VALUE : nums2[m2]);
        return (c1 + c2) * 0.5;
    }
}
