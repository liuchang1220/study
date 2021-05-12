package Suanfa;

import java.util.LinkedList;
import java.util.List;

class Trrenode{
private int value;
public Trrenode left;
public Trrenode right;

    public Trrenode(int value, Trrenode left, Trrenode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Trrenode() {
    }

    public Trrenode(int value) {
        this.value = value;
    }
}
public class Tree2 {
    public static void Pre(Trrenode node){
        if(node!=null){
            System.out.println(node);
            Pre(node.left);
            Pre(node.right);
        }
    }//完全二叉树

    private static  Trrenode createTree(Trrenode root, List<Integer> list){
        LinkedList<Trrenode> queue=new LinkedList<>();
        queue.add(root);
        int cnt=0;
        while(!queue.isEmpty()&&cnt<list.size()){
            Trrenode lastnode=queue.poll();
            if(cnt<list.size()){
                Trrenode left=new Trrenode(list.get(cnt++));
                lastnode.left=left;
                queue.add(left);
            }
            if(cnt<list.size()){
                Trrenode right=new Trrenode(list.get(cnt++));
                lastnode.right=right;
                queue.add(right);
            }

        }
        return  root;
    }
}
