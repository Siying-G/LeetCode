package com.company.LC0957;
import java.util.Arrays;

//一定会超时
public class LC0957_V1 {

    public int[] prisonAfterNDays(int[] cells, int n) {
//        System.out.println(Arrays.toString(cells));
        int len = cells.length;
        int[] cellsNext = new int[len];//cells
//        cellsNext[0] = 0;
//        cellsNext[len-1] = 0;
//        if (n>14) n = (n%15)+1;

        for (int i=0;i<n;i++){
            cellsNext = new int[len];
            System.out.println(Arrays.toString(cells));

            for (int j=1;j<len-1;j++){
                cellsNext[j] = (cells[j-1]==cells[j+1]) ? 1 : 0;
            }
            cellsNext[0] = 0;
            cellsNext[len-1] = 0;
            cells = cellsNext;
        }
        return cellsNext;
    }

    public static void main(String[] args) {
        // write your code here
        int[] cells = new int[]{1,1,0,1,1,0,0,1};
        int n = 300663720;
        LC0957_V1 T = new LC0957_V1();
        System.out.println("end:" + Arrays.toString(T.prisonAfterNDays(cells, n)));
    }
}
//[1,1,0,1,1,0,0,1]
//        300663720