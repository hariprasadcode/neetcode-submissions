class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> h=new HashMap<>();
    
    for( int x :nums){
        if(h.containsKey(x)){
           
            return true;
            
        }
        else{
            h.put(x,1);
        }
         
       

    }
    return false;   
    }
}