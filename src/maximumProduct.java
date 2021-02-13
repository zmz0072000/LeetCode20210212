public class maximumProduct {
    public int maximumProduct(int[] nums) {
        //https://leetcode.com/problems/maximum-product-of-three-numbers/
        //Runtime: 2 ms, faster than 99.28% of Java online submissions for Maximum Product of Three Numbers.
        //Memory Usage: 40.7 MB, less than 26.72% of Java online submissions for Maximum Product of Three Numbers.
        int max1 =Integer.MIN_VALUE, max2 =Integer.MIN_VALUE, max3 =Integer.MIN_VALUE;
        int min1 =Integer.MAX_VALUE, min2 =Integer.MAX_VALUE;
        for (int number: nums){
            if (number> max1){
                max3 = max2;
                max2 = max1;
                max1 = number;
            } else if (number > max2){
                max3 = max2;
                max2 = number;
            } else if (number > max3){
                max3 = number;
            }
            if (number< min1){
                min2 = min1;
                min1 = number;
            } else if (number < min2){
                min2 = number;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }

    public static void main(String[] args) {
        maximumProduct mp = new maximumProduct();
        mp.maximumProduct(new int[]{-1, -2, -3});
    }
}
