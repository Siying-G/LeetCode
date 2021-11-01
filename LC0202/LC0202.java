package com.company.LC0202;


public class LC0202 {
    public boolean isHappy(int n) {
        int sumOfsquares = 0, nowN = n;
        while (nowN>=1){
            int num = nowN%10;
            sumOfsquares += num*num;
            nowN/=10;
        }
        return (sumOfsquares == 1) ? true : isHappyRec(sumOfsquares , sumOfsquares);
    }
    public boolean isHappyRec(int n, int nowN) {
        int sumOfsquares = 0;
        while (nowN>=1){
            int num = nowN%10;
            sumOfsquares += num*num;
            nowN/=10;
        }
        if (sumOfsquares < 10){
            if (sumOfsquares == 1 || sumOfsquares == 7) return true;
            else return false;
        }
        else return isHappyRec(n , sumOfsquares);
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int n = 19;

        LC0202 T = new LC0202();
        System.out.println(T.isHappy(n));
    }
}
