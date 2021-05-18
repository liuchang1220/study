package Suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class AC830 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String []s=br.readLine().split(" ");
        int []a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.parseInt(s[i]);
        }
        Stack<Integer>stack=new Stack<>();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<n;i++){
            while(!stack.empty()&&a[i]<=stack.peek()){
                stack.pop();
            }
            if(stack.empty()){
                stringBuffer.append(-1).append(" ");
            }else {
                stringBuffer.append(stack.peek()).append(" ");
            }
            stack.push(a[i]);
        }
        System.out.println(stringBuffer.toString());
    }
}

