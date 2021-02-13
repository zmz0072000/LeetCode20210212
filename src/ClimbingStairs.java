public class ClimbingStairs {

    //https://leetcode.com/submissions/detail/455442936/
    //Basic idea is correct but ran out of time limit. I'm still studying how to reduce the complexity


    public int climbStairs(int n) {
        if (n<2) return 1;
        else return (climbStairs(n-1)+climbStairs(n-2));
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(45));
    }
}
