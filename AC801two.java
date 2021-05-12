package Suanfa;

import java.util.Scanner;

public class AC801two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int ans=0;
            int a=sc.nextInt();
            String b=Integer.toBinaryString(a);
           char []c=b.toCharArray();
           for(int j=0;j<c.length;j++){
               if(c[j]=='1'){
                   ans++;
               }
           }
            System.out.println(ans+" ");
        }
    }
}
