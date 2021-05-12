package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC785 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int num=Integer.parseInt(br.readLine());
        String []s=br.readLine().split(" ");
        int []a=new int [s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        quicksort(a,0,num-1);
        for(int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }
        br.close();
    }

    private static void quicksort(int[] a, int l, int r) {
        if(l>=r)return;
        int p=a[l],i=l-1,j=r+1;
        while(i<j){
            do i++; while(a[i]<p);
            do j--;while (a[j]>p);
            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        quicksort(a,l,j);
        quicksort(a,j+1,r);
    }
}
