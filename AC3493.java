package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC3493 {
    static int N=100010;
    static int []a=new int [N];
    static int []b=new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        String []s1=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(s1[i]);
        }
        String []s2=br.readLine().split(" ");
        for (int i = 0; i <s2.length ; i++) {
            b[i]=Integer.parseInt(s2[i]);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            if(b[i]!=0){
                sum+=a[i];
            }
        }
        long res=0;
        long sum1=0;
        for(int i=0;i<n;i++){
            if(b[i]==0){
                sum1+=a[i];
            }
            if(i>=k&&b[i-k]==0){
                sum1-=a[i-k];
            }
            res=Math.max(res,sum1);
        }
        System.out.println(res+sum);
    }
}
