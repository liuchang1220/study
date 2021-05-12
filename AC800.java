package Suanfa;

import java.util.Scanner;

public class AC800 {
    static  int N=100010;
    static  int []a=new int[N];
    static int []b=new int [N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            b[i]=sc.nextInt();
        }
        for(int i=0,j=m-1;i<n;i++){
            while(j>=0&&a[i]+b[j]>x){
                j--;
            }
            if(a[i]+b[j]==x){
                System.out.println(i+" "+j);
                break;
        }}
    }
}
