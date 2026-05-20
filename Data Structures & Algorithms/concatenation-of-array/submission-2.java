class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int i=0;
        for( i=0;i<nums.length;i++){
            ans[i]=nums[i] ;
            ans[i+nums.length]=nums[i];
        }
        return ans;


        
    }
}