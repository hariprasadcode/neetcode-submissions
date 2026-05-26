class Solution {
    public int removeDuplicates(int[] nums) {
        
        int unique=0;
        for(int i=0; i<=nums.length-1;i++){
            if(nums[i]!=nums[unique]){
                unique++;
                nums[unique]=nums[i];
            }
        }
        return unique+1;
    }
}