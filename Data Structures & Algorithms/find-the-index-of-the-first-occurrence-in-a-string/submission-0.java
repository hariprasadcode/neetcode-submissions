class Solution {
    public int strStr(String haystack, String needle) {
        char[] hay=haystack.toCharArray();
        char[] nee=needle.toCharArray();

        

        for(int i=0;i<=hay.length-nee.length;i++){
            boolean found=true;
            for(int j=0;j<=nee.length-1;j++){
                if(hay[i+j]!=nee[j]){
                    found =false;
                    break;
                }
            }
             if(found){
               return i;
        }

        }
        return -1;
       
        
    }
}