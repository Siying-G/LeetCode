package com.company.LC0718;
//暴力解法
public class LC0718_V1 {
    public int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length,len2 = nums2.length,ans = 0;
//        while (point1<len1 & point2<len2){
//            if (nums1[point1]==nums2[point2]){//两数相等，则两个指针都向后移动一位，
//                point1++;
//                point2++;
//                ans++;
//            }
//            else if (nums1[point1]<nums2[point2]){
//                point1++;
//                ans = 0;
//            }
//            else {
//                point2++;
//                ans = 0;
//            }
//        }
        for (int i=0;i<len1;i++){
            if (i>0){
                while (nums1[i]==nums1[i-1]) i++;
            }
            for (int j=0;j<len2;j++){
                int point1 = i,point2 = j,midlen = 0;
                while (nums1[point1]==nums2[point2]){
                    midlen++;
                    if (point1<len1-1 & point2<len2-1){
                        point1++;
                        point2++;
                    }
                    else {
                        break;
                    }
                }
                ans = (ans<midlen)?midlen:ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] A = new int[]{1,2,3,2,1}, B = new int[]{3,2,1,4,7};

        LC0718_V1 T = new LC0718_V1();
        System.out.println(T.findLength(A,B));
    }
}
//A: [1,2,3,2,1]  B: [3,2,1,4,7]