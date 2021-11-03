package com.company.LC0383;

public class LC0383_V2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder stringBuilder = new StringBuilder(magazine);
        int index;
        for (char c : ransomNote.toCharArray()) {
            index = stringBuilder.indexOf(String.valueOf(c));
            if (index >= 0) {
                stringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String ransomNote = "aa", magazine = "ab";

        LC0383_V2 T = new LC0383_V2();
        System.out.println(T.canConstruct(ransomNote, magazine));
    }
}
