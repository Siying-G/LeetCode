package com.company.LC1260;

import com.company.LC1764.LC1764_V1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1260_V1 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {//List<List<Integer>>
        int m = grid.length,n = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        Integer[][] intAns = new Integer[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int tem = i*n+j+k;
//                tem = (tem==m*n)? 0 :tem;
                int a = (int)(tem/n),b = tem%n;
                a = (a<m)? a : a%m;
                b = (b<n)? b : b%n;
                intAns[a][b] = grid[i][j];
            }
        }
        for (Integer[] midlist:intAns){
            List<Integer> mid = new ArrayList<>();
            mid.addAll(Arrays.asList(midlist));
            System.out.println(mid);
            ans.add(mid);
        }

//        for (Integer[] midlist:intAns){
//            System.out.println(Arrays.toString(midlist));
//        }

        return ans;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[][] grid = new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        LC1260_V1 T = new LC1260_V1();

        System.out.println(T.shiftGrid(grid,k));
    }
}

//{{1,2,3},{4,5,6},{7,8,9}};k = 1;
//{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};k = 4;
//{{1,2,3},{4,5,6},{7,8,9}}k = 9;