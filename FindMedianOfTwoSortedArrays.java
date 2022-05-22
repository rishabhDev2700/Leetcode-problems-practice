import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 2, 4, 4};
        int[] b = {2, 2, 4, 4};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[nums1.length + nums2.length];
        for (; k < merged.length; k++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    merged[k] = nums1[i];
                    i++;
                } else if (nums2[j] < nums1[i]) {
                    merged[k] = nums2[j];
                    j++;
                }
            } else {
                if (i >= nums1.length) {
                    merged[k] = nums2[j];
                    j++;
                } else if (j >= nums2.length) {
                    merged[k] = nums1[i];
                    i++;
                }
            }
        }
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            median = (double) (merged[mid - 1] + merged[mid]) / 2;
        } else {
            median = merged[mid];
        }
        return median;
    }
}
