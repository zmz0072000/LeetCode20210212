public class PlusOne {

    //https://leetcode.com/problems/plus-one/
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    //Memory Usage: 37.7 MB, less than 40.00% of Java online submissions for Plus One.

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        digits[index]++;
        while (digits[index]>9 && index!=0){
            digits[index] = 0;
            index--;
            digits[index]++;
        }

        if (digits[0]>9){
            int[] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            newDigits[1]=0;
            int i=2;
            while (i< digits.length){
                newDigits[i+1] = digits[i];
                i++;
            }
            return newDigits;
        }
        else return digits;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] question = {9,9};
        int[] answer = po.plusOne(question);
    }
}
