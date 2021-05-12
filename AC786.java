package Suanfa;

import java.util.Scanner;

public class AC786 {
    static int N=100010;
    static int []a=new int[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int a=quicksort(0,n-1,k);
        System.out.println(a);
    }

    private static int quicksort(int l, int r, int k) {
        if(l==r)return a[l];
        int i=l-1,j=r+1,x=a[l];
        while (i<j){
            do i++;while (a[i]<x);
            do j--;while (a[j]>x);
            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }}
            int rel=j-l+1;
            if(k<=rel){
               return quicksort(l,j,k);
            }
               return quicksort(j+1,r,k-rel);
        }
    }

