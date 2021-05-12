package Suanfa;

import java.util.Scanner;

public class AC801 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int ans=0;
            int a=sc.nextInt();
            while(a>0){
                a-=f(a);//二进制一的个数
                ans++;
            }
            System.out.print(ans+" ");
        }
    }

    private static int f(int a) {
        return a&-a;
    }
}
