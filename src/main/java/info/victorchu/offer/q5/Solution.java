package info.victorchu.offer.q5;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c:s.toCharArray()) {
            if(' '==c){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}