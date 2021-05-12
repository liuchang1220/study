package Suanfa;

import java.util.Scanner;

public class AC895 {
    static int N=1010;
    static int []a=new int[N];
    static int []f=new int[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <=n ; i++) {
            f[i]=1;//本身是自己的子串
            for(int j=1;j<=i;j++){
                if(a[i]>a[j]){//最多可循环i次
                    f[i]=Math.max(f[i],f[j]+1);//f[j]表示前面已经更新过的dp
                }
            }

        }
        int res=0;
        for(int i=1;i<=n;i++){
            res=Math.max(res,f[i]);
        }
        System.out.println(res);
    }
}
