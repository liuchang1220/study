package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC835 {
    static int N=10010;
    static int [][]son=new int [N][26];//节点的儿子
    static int []cnt=new int [N];
    static int idx;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while (n-->0){
            String []s=br.readLine().split(" ");
            if("I".equals(s[0])){
                insert(s[1].toCharArray());
            }
            if("Q".equals(s[0])){
                System.out.println(query(s[1].toCharArray()));
            }
        }
        br.close();
    }
    private static void insert(char []chars){
        int p=0;
        for(int i=0;i<chars.length;i++){
            int t=chars[i]-'a';
            if(son[p][t]==0)son[p][t]=++idx;
            p=son[p][t];
        }
        cnt[p]++;
    }
    private static int query(char []chars){
        int p=0;
        for(int i=0;i<chars.length;i++){
            int t=chars[i]-'a';
            if(son[p][t]==0)return 0;
            p=son[p][t];
        }
        return cnt[p];
    }
}
