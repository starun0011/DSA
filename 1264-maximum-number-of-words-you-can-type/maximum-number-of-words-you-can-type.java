class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        char[] arr = brokenLetters.toCharArray();
        int count =0;
        for(String s: str){
            boolean canType = true;
            for(char c:arr){
                if(s.indexOf(c) != -1){
                    canType = false;
                    break;
                }
            } 
            if(canType == true){
                count++;
            }         
        }
        return count;
    }
}