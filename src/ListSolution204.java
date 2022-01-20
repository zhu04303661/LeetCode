//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

public class ListSolution204 {
    public class ListNode{
        int val;
        ListNode next;
    }

    /*
    在遍历链表时，将当前节点的 \textit{next}next 指针改为指向前一个节点。由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
    复杂度分析
    时间复杂度：O(n)O(n)，其中 nn 是链表的长度。需要遍历链表一次。
    空间复杂度：O(1)O(1)。
     */
    public ListNode reverseListNode(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){//while(cur.next != null) 这个是错误的
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static ListNode reverse(ListNode head ){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next; //保留下一个位置

            cur.next = pre; //反转方向

            pre = cur; //重定位
            cur = next;//重定位
        }
        return pre;
    }

    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;

            cur.next =pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {

    }

}
