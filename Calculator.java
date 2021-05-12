package Suanfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        Stack<String>stack1=new Stack<>();
        int z=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            stack.push(m);
        }
        for (int j=0;j<n-1;j++){
            String w = sc.next();
            stack1.push(w);
        }
        while(!stack1.empty()){
            int p1=stack.peek();
            stack.pop();
            int p2=stack.peek();
            stack.pop();
            String s=stack1.peek();
            stack1.pop();
            if(s.equals("+")){
                z=p1+p2;
            }
            if(s.equals("-")){
                z=p2-p1;
            }
            if(s.equals("*")){
                z=p1*p2;
;            }
            if(s.equals("/")){
                if(p1==0){
                    System.out.println("ERROR: "+p2+"/0");
                    System.exit(1);
                }
                else{
                    z=p2/p1;
                }
            }
            stack.push(z);
        }
        System.out.println(z);

    }
}
