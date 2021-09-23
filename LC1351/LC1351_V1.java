package com.company.LC1351;

import com.company.LC1578.LC1578_V1;

public class LC1351_V1 {
    public int countNegatives(int[][] grid) {
        int sum = 0,lenIn = grid[0].length;
        int[] arrIn = new int[grid[0].length];
        for (int i=0;i<grid.length;i++){
            int j = lenIn-1;
            while (j>=0){
                if (grid[i][j]<0) sum++;
                else break;
                j--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[][] grid = new int[][]{{-1}};
        LC1351_V1 T = new LC1351_V1();
        System.out.println(T.countNegatives(grid));
    }
}