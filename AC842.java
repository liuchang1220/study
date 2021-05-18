package Suanfa;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.*;

public class AC842 {
    static int ans=0;
    static int n=0;
    static boolean[]st;
    static int []a=new int[n+1];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         a=new int[n];
         st=new boolean[n+1];
        dfs(0);

    }

    private static void dfs(int i) {
    if(i==n){
        for (int j = 0; j < n; j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        return;
    }
        for (int j = 1; j <=n ; j++) {
            if(!st[j]){
                a[i]=j;
                st[j]=true;
                dfs(i+1);
                st[j]=false;
            }
        }
    }
}
