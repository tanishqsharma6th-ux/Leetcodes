class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                // Remove the closest non-star character to the left
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // Keep normal characters
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
