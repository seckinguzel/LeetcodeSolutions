/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^(6) <= nums1[i], nums2[i] <= 10^(6)
*/

package _4MedianOfTwoSortedArrays;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

        // Example 2
        int [] nums3 = new int[]{1, 2};
        int [] nums4 = new int[]{3, 5};

        System.out.println(solution.findMedianSortedArrays(nums3, nums4));
    }
}
