class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> h=new HashMap<>();
    
    for( int x :nums){
        if(h.containsKey(x)){
            int y=h.get(x);
            y++;
            h.put(x,y);
            
        }
        else{
            h.put(x,1);
        }
         for(int i : h.keySet()){
            if(h.get(x)>1){
                return true;
            }

        }
       

    }
    return false;   
    }
}