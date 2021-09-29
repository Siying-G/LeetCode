package com.company.LC1552;

import java.util.Arrays;

public class LC1552_V1 {
    public int maxDistance(int[] position, int m) {
        int ans = 0;
        //将position排序
        int[] posi = Sort(position);
        if (m==2) return posi[posi.length-1]-posi[0];
        //多个球时，用二分查找找到中间节点的位置
        int low = 1,high = posi[posi.length-1]-posi[0];
        int mid = (high-low)>>1;
        while (low<high){//用二分法查找合适的距离
            if (check(posi,mid,m)){//距离为mid时可行，则向大于等于mid搜索（mid仍有可能）
                low = mid;
                mid = low+((high-low+1)>>1);
            }
            else {//距离为mid时不可行，则向小于mid搜索（mid已不可能）
                high = mid-1;
                mid = low+((high-low+1)>>1);
            }
        }

        return mid;
    }

    public boolean check(int[] posi,int mid,int m){//检查数组posi中是否存在距离为mid的m个球
        int sum = 1,index = 0;
        for (int i = 0;i<posi.length;i++){
            if(posi[i]-posi[index]>=mid){
                sum++;
                index = i;
            }
        }
        return (sum>=m)?true:false;
    }

    public int[] Sort(int[] position) {
        int len = position.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = position[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && position[preIndex] > temp) {
                    position[preIndex + gap] = position[preIndex];
                    preIndex -= gap;
                }
                position[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return position;
    }
    public int BinarySearch(int[] arr,int m){
        int low = 0,high = arr.length-1;
        int mid = (high-low)>>1;
        while (low<high){
            if (arr[mid]<m){
                low = mid+1;
                mid = low+(high-low)>>1;
            }
            else if (arr[mid]>m){
                high = mid-1;
                mid = high-(high-low)>>1;
            }
            else return mid;
        }
        if (arr[mid]>m) return mid-1;
        else return mid+1;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] position = new int[]{79,74,57,22};
        int m = 4;

        LC1552_V1 T = new LC1552_V1();
        System.out.println(T.maxDistance(position,m));
    }
}
//[1,2,3,4,5,6,7,8,9,10]   4
//[79,74,57,22] 4