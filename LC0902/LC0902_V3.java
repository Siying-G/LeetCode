package com.company.LC0902;

public class LC0902_V3 {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s=String.valueOf(n);
        int ans=0;
        for(int i=1;i<s.length();i++){
            ans+=(int)Math.pow(digits.length,i);
        }
        ans+=DivideAndConquer(s.toCharArray(),digits,0);
        return ans;
    }
    public int DivideAndConquer(char[] target,String[] digits,int deep){
        if(deep>=target.length){
            return 1;
        }
        int sum=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i].charAt(0)<target[deep]){
                sum+=Math.pow(digits.length,target.length-deep-1);
            }
            else if(digits[i].charAt(0)==target[deep]){
                sum+=DivideAndConquer(target,digits,deep+1);
            }
            else{
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // write your code here
        String[] digits = new String[]{"5","6"};
        int n = 19;
        LC0902_V3 T = new LC0902_V3();
        System.out.println(T.atMostNGivenDigitSet(digits, n));
    }
}


//["3","5"]
//        4  1

//["3","4","5","6"]
//        64 18

//["5","6"]
//        19 2

//["1","7"]
//        231  10

//["1","2","3","4","5","6","7","9"]
//        1   1

//["5","7","8"]
//        59   6

//["1","2","3","4","6","7","9"]
//        333 171