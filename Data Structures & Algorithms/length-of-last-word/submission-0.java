class Solution {
    public int lengthOfLastWord(String s) {
        char [] a=s.toCharArray();
        int i=0;
        int j=a.length-1;
        int count=0;
     
            while(i<=j && a[j]==' '){
                j--;
            }
            while(i<=j && a[j]!=' '){
                count++;
                j--;
            }
       
        return count;
        
    }
}