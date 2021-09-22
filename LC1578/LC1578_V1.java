package com.company.LC1578;
import java.util.Stack;

public class LC1578_V1 {
    public int minCost(String s, int[] cost) {
        Stack<Character> StrSta = new Stack<Character>();
        StrSta.push(s.charAt(0));
        int sum = 0;
        for (int i = 1;i<s.length();i++){
            if(StrSta.peek() == s.charAt(i)){//有连续的重复，需要删除
                if (cost[i]>cost[i-1]){
                    sum += cost[i-1];
                    cost[i-1] = cost[i];
                }
                else {
                    sum += cost[i];
                    cost[i] = cost[i-1];
                }
            }
            StrSta.push(s.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String s = "aaaaa";
        int[] cost = new int[]{1,2,1,2,1};
        LC1578_V1 T = new LC1578_V1();
        System.out.println(T.minCost(s, cost));
    }
}

//"aaabbbabbbb"
//        [3,5,10,7,5,3,5,5,4,8,1]