/*
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
输入：head = [1,2,3,4]
输出：[2,1,4,3]
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSolution24 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;

        while( pre.next != null && pre.next.next !=null){
            ListNode a = pre.next;
            ListNode b = pre.next.next;

            pre.next = b;
            a.next = b.next;
            b.next = a;

            pre = a;
        }
        return  pre.next;
    }
    public static ListNode swapPairs2(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode a = temp.next;
            ListNode b = temp.next.next;

            temp.next = b;
            a.next = b.next;
            b.next = a;

            temp = a;
        }
        return pre.next;
    }

//    public static ListNode swap(ListNode head){
//        ListNode pre = new ListNode(0);
//        pre.next = head;
//        ListNode tmp = pre;
//        while (tmp.next!=null && tmp.next.next != null){
//            ListNode a = tmp.next;
//            ListNode b = tmp.next.next;
//
//            b.next = a;
//            a.next = b;
//            tmp.next = b;
//
//            tmp=a;
//        }
//        return pre.next;
//    }
    public static ListNode swap(ListNode head){
          ListNode pre = new ListNode(0);
          pre.next = head;
          ListNode tmp = pre;
          while (tmp.next!=null && tmp.next.next!=null){
              ListNode a = pre.next;
              ListNode b = pre.next.next;

              b.next =a;
              a.next =b;
              tmp.next =b;

              tmp=a;
          }
          return pre.next;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,9,4);

        List<ListNode> listNodeList = new ArrayList<>();
        for(Integer x : list){
            ListNode node = new  ListNode(x);
            if(listNodeList.size()>0){
                ListNode pre = listNodeList.get(listNodeList.size()-1);
                pre.next = node;
            }
            listNodeList.add(node);
        }

        ListNode a= swapPairs2(listNodeList.get(0));
        System.console();
    }
}
