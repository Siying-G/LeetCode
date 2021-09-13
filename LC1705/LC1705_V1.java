package com.company.LC1705;

import com.company.LC1930.LC1930_V2;

import java.util.*;
import java.lang.Integer;

public class LC1705_V1 {
//    public int eatenApples(int[] apples, int[] days) {
//        int sum = 0,allApples = 0,day = days.length;
//        Map<Integer,Integer> appDay = new TreeMap<Integer,Integer>(
//                new Comparator<Integer>() {
//                    public int compare(Integer obj1, Integer obj2) {
//                        // 降序排序
//                        return obj1.compareTo(obj2);
//                    }
//                });
//        //<失效日期，剩余苹果数>
//        for (int i = 0;i<day;i++){
//            days[i] += i;
//            if (apples[i]==0) continue;
//            if (appDay.containsKey(days[i])) appDay.put(days[i],appDay.get(days[i])+apples[i]);
//            else appDay.put(days[i],apples[i]);
//        }
//        int i = 0;
//        Set<Integer> keyset = appDay.keySet();
//        System.out.println(keyset);
//        for (i = 0;i<day;i++){
//            allApples += apples[i];//添加新出现的苹果数
//            if(allApples>0){
//                sum += 1;
//                allApples -= 1;
//                appDay.put(days[i],appDay.get(days[i])-1);
//            }
//            if(appDay.containsKey(i+1)) {//有苹果今日到期
//                allApples -= appDay.get(i+1);//减去失效的苹果数
//                appDay.remove(i+1);
//            }
//        }
////        while (allApples > 0){
////            sum += 1;
////            allApples -= 1;
////            if(appDay.containsKey(i+1)) allApples -= appDay.get(i+1);//减去失效的苹果数
////
////            i++;
////        }
//        System.out.println(Arrays.toString(days));
//        return sum;
//    }

    public int eatenApples(int[] apples, int[] days) {
        // 小顶堆存放苹果的过期天数和数量
        Queue<int[]> heap=new PriorityQueue<>((a,b)->a[0]-b[0]);//队列中的每个元素是一个包含两个元素的数组，【过期日期，苹果数量】
        int count=0;
        // 在未遍历完数组/堆不为空时
        for(int i=0;i<apples.length||!heap.isEmpty();i++){
            //   移除过期 / 数量为0 的苹果
            while(!heap.isEmpty()){
                int[] a=heap.peek();
                if(a[0]<=i||a[1]==0){
                    heap.poll();
                }else{
                    break;
                }
            }
            //   加入当天苹果
            if(i<apples.length&&apples[i]>0){
                heap.add(new int[]{i+days[i],apples[i]});//【过期日期，苹果数量】
            }
            //   吃苹果
            int[] b=heap.peek();
            if(b!=null&&b[0]>=i&&b[1]>0){
                b[1]--;
                count++;
            }
        }
        //   返回结果
        return count;
    }
    public static void main(String[] args) {
        // write your code here
        int[] apples = new int[]{3,0,0,0,0,2};
        int[] days = new int[]{3,0,0,0,0,2};
        LC1705_V1 T = new LC1705_V1();
        System.out.println(T.eatenApples(apples,days));
    }
}
