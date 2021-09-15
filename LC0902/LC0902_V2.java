package com.company.LC0902;

import java.util.ArrayList;

public class LC0902_V2 {

    public int atMostNGivenDigitSet(String[] digits, int n) {
        if (n%10 == 0) n -= 1;
        int[] StrtoInt = new int[digits.length];
        for (int i=0;i<digits.length;i++) StrtoInt[i] = Integer.parseInt(digits[i]);
        int[]  Ndigits = culLen(n);
        int sum = 0,lenSI = StrtoInt.length,last = 1,ind = 0;
        for (int i=0;i<Ndigits.length-1;i++){//前Ndigits.length-1位数，可以随意组合digits中的数字
            sum += Math.pow(lenSI,i+1);
        }
        int a = BinarySearch(StrtoInt,Ndigits[0])-1;//找Ndigits[0]在StrtoInt中的位置
        if (a<0) return sum+DigitSet(StrtoInt,Ndigits,1);//Ndigits[0]<StrtoInt[0],此时需递归计算后面的子串
        else if (a == 0) {//Ndigits[0]==StrtoInt[0]或Ndigits[0]>StrtoInt[0],此时需递归计算后面的子串
            if (Ndigits[0]==StrtoInt[0]) return sum+DigitSet(StrtoInt,Ndigits,1);//Ndigits[0]==StrtoInt[0]
            else return sum+(int)(Math.pow(lenSI,Ndigits.length-1));
        }
        else{
            int low = (int)(a*Math.pow(lenSI, Ndigits.length-1));
            System.out.println(low);
            return sum+ low +DigitSet(StrtoInt,Ndigits,1);
        }

    }

    public int DigitSet(int[] StrtoInt, int[] Ndigits,int deep) {
        if (deep >=Ndigits.length) return 1;
        int sum = 0,lenSI = StrtoInt.length,last = 1,ind = 0;
//        for (int i=deep;i<Ndigits.length-1;i++){//前Ndigits.length-1位数，可以随意组合digits中的数字
//            sum += Math.pow(lenSI,i+1);
//        }

        int a = BinarySearch(StrtoInt,Ndigits[deep])-1;//找Ndigits[0]在StrtoInt中的位置
        if (a<0) return sum+DigitSet(StrtoInt,Ndigits,deep+1);//Ndigits[0]<StrtoInt[0],此时需递归计算后面的子串
        else if (a == 0) return sum+DigitSet(StrtoInt,Ndigits,deep+1);//Ndigits[0]>=StrtoInt[0],此时需递归计算后面的子串
        else return sum+ (int)(a*Math.pow(lenSI, Ndigits.length-deep-1)) +DigitSet(StrtoInt,Ndigits,deep+1);

//        return sum+DigitSet(StrtoInt,Ndigits,deep+1);

    }

    public int BinarySearch(int[] arr, int key){
        int low = 0,high = arr.length-1,mid = 0;
        while (low <= high){
            mid = (low+high)/2;
            if (arr[mid]<key) low = mid+1;
            else if (arr[mid]>key) high = mid-1;
            else return mid+1;//正好找到key
        }
        if (arr[mid] > key) return mid;
        else return mid+1;
    }

    public int[] culLen(int n){//计算n是几位数，并输出每一位上的数字
        ArrayList<Integer> ANdigits = new ArrayList<Integer>();
        while (n/10 >0){
            ANdigits.add(n%10);
            n /= 10;
        }
        ANdigits.add(n);
        int[] Ndigits = new int[ANdigits.size()];
        for (int i = 0;i<ANdigits.size();i++) Ndigits[i] = ANdigits.get(ANdigits.size() - i-1);
        return Ndigits;
    }

    public static void main(String[] args) {
        // write your code here
        String[] digits = new String[]{"5","6"};
        int n = 19;
        LC0902_V2 T = new LC0902_V2();
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