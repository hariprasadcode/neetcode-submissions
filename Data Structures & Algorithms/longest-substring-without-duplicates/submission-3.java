class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>h= new HashSet<>();

        char[] ch=s.toCharArray();

       int max=0;
       int i=0;
       int j=0;
       while(j<ch.length){
        if(!h.contains(ch[j])){
            h.add(ch[j]);
            max=Math.max(max,j-i+1);
            j++;

        }
        else{
            h.remove(ch[i]);
            i++;
        }
       }
       return max;
        
    }
}
