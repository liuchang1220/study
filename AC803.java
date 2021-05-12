package Suanfa;

import java.util.*;

public class AC803 {//区间合并
static int c=0;
static int []a;
static List<int[]>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            a=new int [2];
         a[0]=sc.nextInt();
         a[1]=sc.nextInt();
         list.add(a);
        }
        merge(list);
        System.out.println(c);
        System.out.println(merge1(list));

    }

    private static void merge(List<int[]> list) {
        list.sort((p,q)->(p[0]-q[0]));
        int r=Integer.MIN_VALUE;
        for (int b[]:list
             ) {
            if(b[0]>r){
                c++;
            }
            r=Math.max(r,b[1]);
        }
    }
    private static int merge1(List<int[]> list){
        ArrayList<int []>list1=new ArrayList<>();
        list.sort((p,q)->(p[0]-q[0]));
        int st=Integer.MIN_VALUE;
        int end=Integer.MIN_VALUE;
        for (int []b:list
             ) {
            if(b[0]>end){
                list1.add(new int[]{st,end});
                st=b[0];
                end=b[1];
            }else{
                end=Math.max(end,b[1]);
            }
        }
        if(st==Integer.MIN_VALUE){
            list1.add(new int []{st,end});
        }
        return list1.size();
    }
}
