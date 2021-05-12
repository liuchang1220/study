package Suanfa;

import java.util.Scanner;

public class AC2two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int V[]=new int [n+1];
        int []w=new int [n+1];
        for(int i=1;i<=n;i++){
            V[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        int []dp=new int [n+1];
        for(int i=1;i<=n;i++){
            for(int j=V[i];j<=v;j++){
                    dp[j]=Math.max(dp[j],dp[j-V[i]]+w[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
