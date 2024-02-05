package _4MedianOfTwoSortedArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .toArray();

        int length = sortedArray.length;

        if (length % 2 == 1) {
            return sortedArray[length / 2];
        } else {
            int mid1 = sortedArray[length / 2 -1];
            int mid2 = sortedArray[length / 2];

            return (double) (mid1 + mid2) / 2;
        }
    }
}
