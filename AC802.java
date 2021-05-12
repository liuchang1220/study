package Suanfa;

import java.util.*;

public class AC802 {
        static int N=300010;
        static int []a=new int [N];
        static int []s=new int [N];
        static List<Integer> alls=new ArrayList<>();//需要去重的排序的下标数组
        static List<int []> add=new ArrayList<>();//保留插入元素的下标和待插入的值，插入更新
        static List<int []> query=new ArrayList<>();//保留左右端点,询问;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int c=sc.nextInt();
            add.add(new int []{x,c});
            alls.add(x);
        }
      while(m-->0){
          int l=sc.nextInt();
          int r=sc.nextInt();
          query.add(new int []{l,r});
          alls.add(l);
          alls.add(r);
      }
        Collections.sort(alls);
      List<Integer>un=unique(alls);
        for (int []t:add
             ) {
            int x=find(t[0]);
            int c=t[1];
            a[x]+=c;
        }
        for(int i=1;i<a.length;i++)s[i]=s[i-1]+a[i];
        for(int []t:query){
            int l=find(t[0]);
            int r=find(t[1]);
            System.out.println(s[r]-s[l-1]);
        }

    }

    private static int find(int i) {
        int l=0,r=alls.size()-1;
        while (l<r){
            int mid=(l+r)/2;
            if(alls.get(mid)>=i)r=mid;
            else l=mid+1;
        }
        return l+1;
    }

    private static List<Integer> unique(List<Integer> alls) {
        int j=0;
        Set<Integer>set=new HashSet<>();
        set.addAll(alls);
        List<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
