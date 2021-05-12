package Suanfa;

import java.util.Scanner;

public class AC795 {
    static  int N=100010;
    public static void main(String[] args) {//前缀和
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[N];
        int []s=new int[N];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            s[i]=s[i-1]+a[i];//求和数组的创建
        }
        while(m-->0){
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            System.out.println(s[b1]-s[a1-1]);//前缀和公式
        }
    }
}