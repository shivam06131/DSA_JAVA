package Array4;

import java.util.HashMap;

public class SubstringWithoutRepeating {
    public static void main(String[] args) {
//        countSubstring("pwwkew");
//        countSubstring("abcabcbb");
//        countSubstring("bbbbb");
        countSubstring("abba");
    }

    static int countSubstring(String str){
        int maxCount = 0;
        int localCount = 0;
        int lastIndexFound = 0;
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<>();

        for (int i=0;i<ch.length;i++){
            if(hash.containsKey(ch[i])){
                if((hash.get(ch[i]) + 1) < lastIndexFound){
                    lastIndexFound = hash.get(ch[i]) + 1;
                    localCount = i + 1 - lastIndexFound;
                }
            }else {
                localCount++;
            }
            hash.put(ch[i],i);
            maxCount = Math.max(localCount,maxCount);
        }

        return maxCount;
    }
}
