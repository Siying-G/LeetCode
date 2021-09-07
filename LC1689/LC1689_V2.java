package com.company;

class LC1689_V2 {
    public int minPartitions(String n) {
        int max=-1;
        for (int ind = 0; ind<n.length(); ind++){
            if((n.charAt(ind)-'0')>max) max = n.charAt(ind)-'0';
        }
        return max;

    }
    public static void main(String[] args) {
        // write your code here
        String num = "27346209830709182346";//new String();
        LC1689_V1 T = new LC1689_V1();
        System.out.println(T.minPartitions(num));
    }
}
