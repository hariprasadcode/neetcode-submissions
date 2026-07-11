class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h= new HashMap<>();

        for(int i=0;i<=strs.length-1;i++){

            char[] c=strs[i].toCharArray();

            for(int j=0;j<=c.length-1;j++){
                for(int k=j+1;k<=c.length-1;k++){
                    if(c[j]>c[k]){
                        char temp=c[j];
                        c[j]=c[k];
                        c[k]=temp;
                    }
                }
            }
            String key=new String(c);
            if(h.containsKey(key)){
                h.get(key).add(strs[i]);
            }
            else{
                List<String> l= new ArrayList<>();
                l.add(strs[i]);
                h.put(key,l);
            }
        }
        return new ArrayList<>(h.values());
     
       
    }
}
