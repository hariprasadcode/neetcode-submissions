class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> h=new HashSet<>();

    for(int x : nums){
        h.add(x);
    }
    int max=0;
    for(int x :h){
        if(!h.contains(x-1)){
            int current =x;
            int count=1;
            while(h.contains(current+1)){
                current++;
                count++;
            }
            max=Math.max(max,count);
        }
    }
    return max;
        
    }
}
