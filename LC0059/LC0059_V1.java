package com.company.LC0059;

import java.util.Arrays;

public class LC0059_V1 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int x = 0, y = 0,direction = 0;//direction表示方向，0右，1下，2左，3上
        for (int i = 1; i <= n*n; i++){
            ans[x][y] = i;
            if (direction == 0){
                if (y != n-1){
                    if (ans[x][y+1] == 0) y++;//判断向右到头
                    else {
                        x++;
                        direction = 1;
                    }
                }
                else {
                    x++;
                    direction = 1;
                }
            }
            else if (direction == 1){
                if (x != n-1 ) {
                    if (ans[x+1][y] == 0) x++;//判断向右到头
                    else {
                        y--;
                        direction = 2;
                    }
                }
                else {
                    y--;
                    direction = 2;
                }
            }
            else if (direction == 2){
                if (y != 0 ) {
                    if (ans[x][y-1] == 0) y--;//判断向右到头
                    else {
                        x--;
                        direction = 3;
                    }
                }
                else {
                    x--;
                    direction = 3;
                }
            }
            else{//direction == 3
                if (ans[x-1][y] == 0) x--;//判断向右
                else {
                    y++;
                    direction = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int n = 5;
        LC0059_V1 T = new LC0059_V1();
        System.out.println(Arrays.toString(T.generateMatrix(n)) );
    }
}
