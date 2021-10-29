package com.company.LC0242;


import java.util.HashMap;
import java.util.Map;

public class LC0242_V1 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hashmap = new HashMap();
        for(char c : s.toCharArray()){
            if (hashmap.containsKey(c)) hashmap.put(c, hashmap.get(c)+1);
            else hashmap.put(c, 1);
        }
        for(char c : t.toCharArray()){
            if (hashmap.containsKey(c)){
                hashmap.put(c, hashmap.get(c)-1);
                if (hashmap.get(c)==0) hashmap.remove(c);
            }

            else return false;
        }

        return (hashmap.size()>0) ? false : true;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String s = "rat", t = "cat";

        LC0242_V1 T = new LC0242_V1();
        System.out.println(T.isAnagram(s,t));
    }

}
