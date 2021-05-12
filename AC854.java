package Suanfa;

import java.util.Scanner;

public class AC854 {
    static int  [][]g=new  int [205][20500];
    static  final int INT=0x3f3f3f3f;
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j)g[i][j]=0;
                g[i][j]=INT;
            }

        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            g[a][b]=Math.min(c,g[a][b]);
        }
        floyd();
        for(int i=0;i<k;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(g[a][b]>INT/2){
                System.out.println("impossible");
            }
            else {
                System.out.println(g[a][b]);
            }
    }}

    private static void floyd() {
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(g[i][j]>g[i][k]+g[k][j]){
                        g[i][j]=g[i][k]+g[k][j];}
                }
            }
        }
    }
}
