package Suanfa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AC3502 {
    static int k=0;
    static Set<Integer>set=new HashSet<>();
    static int []dx={-1,0,1,0};
    static int []dy={0,1,0,-1};
    static int n=0;
    static int m=0;
    static int [][]a=new int[10][10];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         m=sc.nextInt();
         k=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                dfs(0,i,j,a[i][j]);
            }
        }
        System.out.println(set.size());


    }

    private static void dfs(int u, int x, int y, int c) {
        if(u==k){
            set.add(c);
            return;
        }else {
            for(int i=0;i<4;i++){
                int x1=x+dx[i],y1=y+dy[i];
                if(x1>=0&&x1<n&&y1>=0&&y1<m){
                    dfs(u+1,x1,y1,c*10+a[x1][y1]);
                }
            }
        }

    }
}
