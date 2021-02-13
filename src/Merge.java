public class Merge {

    //https://leetcode.com/problems/merge-sorted-array/submissions/
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
    //Memory Usage: 38.9 MB, less than 89.96% of Java online submissions for Merge Sorted Array.

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int currentIndex = m+n-1;
        while (index1>=0 && index2>=0){
            if (nums1[index1]>nums2[index2]) nums1[currentIndex--] = nums1[index1--];
            else nums1[currentIndex--] = nums2[index2--];
        }
        while (index2>=0) nums1[currentIndex--] = nums2[index2--];
    }

    public static void main(String[] args) {

    }
}
