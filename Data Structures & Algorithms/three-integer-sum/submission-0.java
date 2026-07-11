class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s= new HashSet<>();

       for(int i=0;i<=nums.length-1;i++){
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            if(nums[i]+nums[j]+nums[k]==0){
                List<Integer>l= new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(nums[k]);

                s.add(l);
                 j++;
                 k--;
            }
           
           else if(nums[i]+nums[j]+nums[k]>0){
            k--;
           }
           else{
            j++;
           }

        }
       }
       return new ArrayList(s);
    }
}
