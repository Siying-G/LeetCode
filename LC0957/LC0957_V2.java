package com.company.LC0957;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//周期是14
public class LC0957_V2 {

    public int[] prisonAfterNDays(int[] cells, int n) {
//        System.out.println(Arrays.toString(cells));
        int len = cells.length;
        int[] cellsNext = new int[len];//cells
//        cellsNext[0] = 0;
//        cellsNext[len-1] = 0;
        n = (n%14 == 0) ? 14 : n%14;

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
        int[] cells = new int[]{1,0,0,1,0,0,1,0};
        int n = 17;
        LC0957_V2 T = new LC0957_V2();
        System.out.println(Arrays.toString(T.prisonAfterNDays(cells, n)));
    }
}
