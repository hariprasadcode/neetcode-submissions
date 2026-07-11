class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer ,Integer>h= new HashMap<>();
        int[] a=new int[nums.length];
        for(int x : nums){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }

           
        }
        int size=h.size();

       int[] key=new int[size];
       int[] freq=new int[size];

       int index=0;
       for(Map.Entry<Integer,Integer> entry : h.entrySet()){
        key[index]=entry.getKey();
        freq[index]=entry.getValue();
        index++;
       }


        for(int i=0;i<=size-1;i++){
            for(int j=i+1;j<=size-1;j++){
               if(freq[i]<freq[j]){
                int temp=freq[i];
                freq[i]=freq[j];
                freq[j]=temp;

                temp=key[i];
                key[i]=key[j];
                key[j]=temp;
               }
            }
        }

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=key[i];
        }
return ans;
    
      

        
    }
}
