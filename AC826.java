package Suanfa;

import java.util.Scanner;

public class AC826 {
   static int N=100010;
   static int []e=new int [N];
   static int []n=new int [N];
   static int hh;
   static int idx;
   private static void init(){
       hh=-1;
       idx=0;
   }
   private static void H(int x){
       e[idx]=x;
       n[idx]=hh;
       hh=idx++;
   }
   private static void insert(int k,int x){
    e[idx]=x;
    n[idx]=n[k];
    n[k]=idx++;
   }
    private static void delete(int k){
       n[k]=n[n[k]];
    }
    public static void main(String[] args) {
       init();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        while(n1-->0){
            String s=sc.next();
            if("H".equals(s)){
                int a=sc.nextInt();
                H(a);
            }
            if("I".equals(s)){
                int b=sc.nextInt();
                int c=sc.nextInt();
                insert(b-1,c);
            }
            if("D".equals(s)){
                int d=sc.nextInt();
                if(d==0){
                    hh=n[hh];
                }else {
                delete(d-1);
            }}
        }
        for(int i=hh;i!=-1;i=n[i]){
            System.out.print(e[i]+" ");
        }
    }
}
