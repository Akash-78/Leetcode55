public class Leetcode55 {
    public boolean jumpGame(int[] nums){
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            if (dp[i-1]-1>=0){
                dp[i]=Math.max(nums[i],dp[i-1]-1);
            }
            else
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] n={2,3,1,1,4};
        Leetcode55 leetcode55 = new Leetcode55();
        System.out.println(leetcode55.jumpGame(n));
    }
}
