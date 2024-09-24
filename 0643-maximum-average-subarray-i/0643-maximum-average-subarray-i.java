class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
        int MaxSUm=sum;
        for(int i=k;i<nums.length; i++){
            sum-=nums[i-k];
            sum+=nums[i];
            MaxSUm=Math.max(sum,MaxSUm);
        }
        return (double) MaxSUm/k;
    }
}