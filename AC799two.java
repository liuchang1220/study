package Suanfa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AC799two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        int []a=new int[n];
        int res=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0,j=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        while (map.get(a[i])>1){
            map.put(a[j],map.get(a[j])-1);
            j++;
        }
        res=Math.max(res,i-j+1);
    }
        System.out.println(res);}
}
