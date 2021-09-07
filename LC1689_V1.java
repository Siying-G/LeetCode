package com.company;

class LC1689_V1 {
    public int minPartitions(String n) {
        int len ,sum = 0;
        long toInt = 1;
        String nn = n;
        StringBuilder strBuilder = new StringBuilder(n);
        Boolean flag = true;
        while (flag){
            String midVar = "";
            char min = '9';
            len = strBuilder.length();
            for (int ind = 0; ind<len; ind++){
//                midVar*=10;
                char step = strBuilder.charAt(ind);
                min = (step-min<0 & step-'0' != 0)  ? step : min;
                midVar += (step=='0') ? '0' : '1';
            }
            for (int ind = 0; ind<len; ind++){
                int charmid=strBuilder.charAt(ind)-'0';
                charmid -= (midVar.charAt(ind)-'0')*(min-'0');
//                System.out.println("charmid: "+charmid);
                strBuilder.setCharAt(ind, (char) (charmid+'0'));//String.valueOf(charmid)
            }
            sum += min-'0';
            while (strBuilder.charAt(0) == '0'){
                if(strBuilder.length() == 1 & strBuilder.charAt(0)=='0'){
                    flag = false;
                    break;
                }
                strBuilder = strBuilder.deleteCharAt(0);
            }

            System.out.println("midVar: "+midVar);
            System.out.println("strBuilder: "+strBuilder);
//            toInt -=  midVar*min;
//            n = String.valueOf(toInt);
        }
//        System.out.println(n.charAt(1));
        return sum;
    }
    public static void main(String[] args) {
        // write your code here
        String num = "27346209830709182346";//new String();
        LC1689_V1 T = new LC1689_V1();
        System.out.println(T.minPartitions(num));
    }
}
