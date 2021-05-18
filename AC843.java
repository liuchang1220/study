package Suanfa;

import java.util.Scanner;

public class AC843 {
    static int N=10;
    static char [][]g=new char[N][N];
    static int n=0;
    static boolean []a=new boolean[N];
    static boolean []b=new boolean[N];
    static boolean []c=new boolean[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++){
                g[i][j]='.';
            }
        }
        dfs(0);
    }

    private static void dfs(int x) {
        if(x==n){
            for (int j = 0; j <n ; j++) {
                for (int i = 0; i <n ; i++) {
                    System.out.print(g[j][i]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!a[i]&&!b[x+i]&&!c[n-x+i]){
                a[i]=b[x+i]=c[n-x+i]=true;
                g[x][i]='Q';
                dfs(x+1);
                a[i]=b[x+i]=c[n-x+i]=false;
                g[x][i]='.';
            }
        }
    }

}
