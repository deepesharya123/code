class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)>='A'&& word.charAt(i)<='Z'){
                capital++;
            }
        } 
        return capital==0 || (capital==1&&word.charAt(0)>='A' &&word.charAt(0)<='Z') || capital==word.length()? true :false;
    }
}