package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC799 {
    static int N=100010;
    static int []sum=new int [N];
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(in);
        int n=Integer.parseInt(sc.readLine());
        String []s=sc.readLine().split(" ");
        int []a=new int [n];
        for (int i=0;i<n;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int ans=0;
        for(int i=0,j=0;i<n;i++){
            sum[a[i]]++;
            while(sum[a[i]]>1){
                sum[a[j]]--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        System.out.println(ans);
        sc.close();
    }
}
