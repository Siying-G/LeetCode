package com.company.LC0383;


import java.util.HashMap;
import java.util.Map;

public class LC0383_V1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapNote = new HashMap<Character, Integer>();
        for (char ch : magazine.toCharArray()){
            if (!mapNote.containsKey(ch)) mapNote.put(ch,1);
            else mapNote.put(ch,mapNote.get(ch)+1);
        }
        for (char ch : ransomNote.toCharArray()){
            if (!mapNote.containsKey(ch)) return false;
            else {
                if (mapNote.get(ch) == 1) mapNote.remove(ch);
                else mapNote.put(ch,mapNote.get(ch)-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String ransomNote = "aa", magazine = "aab";

        LC0383_V1 T = new LC0383_V1();
        System.out.println(T.canConstruct(ransomNote, magazine));
    }
}
