public class Solution {
    public String reverseWords(String s) {
        String delims = "[ ]+";
        String[] tokens = s.split(delims);
        
        for (int i = 0; i < tokens.length/2; i++){
            String temp = tokens[i];
            tokens[i] = tokens[tokens.length - i - 1];
            tokens[tokens.length - i - 1] = temp;
        }
        
        String t = join(tokens, " ");
        return t;
    }
    
    
    public static String join(String[] list, String delim) {

        StringBuilder sb = new StringBuilder();
    
        String loopDelim = "";
    
        for(String st : list) {
    
            sb.append(loopDelim);
            sb.append(st);            
    
            loopDelim = delim;
        }
    
        return sb.toString().trim(); // Strip Leading and Trailing Space
    }
    
}
