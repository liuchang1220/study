package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC898 {
    public static void main(String[] args) throws IOException {
        int [][]a=new int [510][510];
        int [][]f=new int[510][510];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i = 1; i <=n ; i++) {
            String []s=br.readLine().split(" ");
            for(int j=1;j<=i;j++){
                a[i][j]=Integer.parseInt(s[j-1]);
            }
        }
        for (int i = n; i >=1 ; i--) {
            for(int j=1;j<=i;j++){//防止溢出
                f[i][j]=Math.max(f[i+1][j],f[i+1][j+1])+a[i][j];//从下到上找，先确定上层再更新下一层的dp表
            }
        }
        System.out.println(f[1][1]);
    }
}
