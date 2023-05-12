class Solution {
    public int jump(int[] nums) {
        int start=0,end=0,farthest=0,jump=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
        }
        return jump;
    }
}