package Suanfa;

import java.util.List;

public class AC35 {//反转链表
static class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
    public static void main(String[] args) {
    ListNode a=new ListNode(0);
    ListNode b=new ListNode(1);
    ListNode c=new ListNode(2);
    a.next=b;
    b.next=c;
        System.out.println(reverse(a).val);

    }
    private static ListNode reverse(ListNode head){
    if(head==null)return  head;
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode cur=head.next;//插入dummy后的节点
    ListNode tail=head;//tail作为头节点不变
    while(cur!=null){
        ListNode n=cur.next;
        cur.next=dummy.next;
        dummy.next=cur;
        tail.next=n;
        cur=n;
    }
    return dummy.next;
    }
    private static ListNode reverseList(ListNode head){
  if(head==null||head.next==null)return head;
  ListNode tail=reverseList(head.next);
  head.next.next=head;
  head.next=null;
  return tail;
}}
