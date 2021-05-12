package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC836 {
    static int n,m;
    static int N=100010;
    static int []p=new int[N];
    private static int find(int x){
        if(x!=p[x]){
            p[x]=find(p[x]);//只用find一次即可把所有父节点指向根节点
        }
        return p[x];
    }
    public static void main(String[] args) throws IOException {//并查集找父亲
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
         String []s=br.readLine().split(" ");
         n=Integer.parseInt(s[0]);
         m=Integer.parseInt(s[1]);
        for (int i = 0; i <n ; i++) {
            p[i]=i;
        }
        while(m-->0){
            String []s1=br.readLine().split(" ");
            int a=Integer.parseInt(s1[1]);
            int b=Integer.parseInt(s1[2]);
            if("M".equals(s1[0])){
                p[find(a)]=find(b);
            }else {
                if(find(a)==find(b)) System.out.println("Yes");
                 else System.out.println("No");
            }

        }

        br.close();
    }
}
