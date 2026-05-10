class Solution {
    public void rotate(int[] nums, int k) {

        int[] temp=new int[nums.length];

        k=k%nums.length;
        
        int index=0;

        for(int i=nums.length-k; i<=nums.length-1; i++){
            temp[index++]=nums[i];
        }
        for(int i=0;i<=nums.length-k-1;i++){
            temp[index++]=nums[i];
        }

        for(int i=0;i<=nums.length-1;i++){
            nums[i]=temp[i];
        }
        
    }
}