package Suanfa;

import java.util.Scanner;

public class Dfs1 {//部分和
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        dfs(a,k,0);
    }

    private static void dfs(int[] a, int k, int i) {
    if(k==0){
        System.out.println("yes");
        System.exit(1);
    }
    if(k<0||i==a.length)return;
    dfs(a, k, i+1);
    dfs(a, k-a[i], i+1);
    }
}
