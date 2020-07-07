class Solution {
    public boolean isSubsequence(String s, String t) {
        int subLength = s.length();
        int origLength = t.length();
        int j=0;
        if(subLength == 0){
            return true;
        }
        for(int i=0;i<origLength;i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j==subLength){
            return true;
        }
        }
        
        return false;

    }
}
