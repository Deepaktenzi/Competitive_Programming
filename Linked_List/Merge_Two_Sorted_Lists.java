/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together 
the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

*/


class LList{
    Node head;
class Node{
    int val;
    Node next;
    

    Node(int data){
        this.val = data;
        this.next = null;
    }
}
void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

void revrseList(){
    Node pre = null;
    
    while(head!=null){
        Node nextNode = head.next;
        head.next = pre;
        pre = head;
        head = nextNode;
    }
    head = pre;
}


void addLast(int data){
    Node newNode = new Node(data);
    Node curNode = head;
    if(head == null){
        head = newNode;
        return;
    }
    
    while(curNode.next!=null){
        curNode = curNode.next;
    }
    curNode.next = newNode;
}

void mergeList(Node list1, Node list2){
    
    Node dummyNode = new Node(0);
    Node dummyhead = dummyNode;
    Node p = list1;
    Node q = list2; 

    while(p !=null && q!=null){
        if(p.val<q.val){
            dummyhead.next = p;
            p = p.next;
        }
        else {
            dummyhead.next = q;
            q = q.next;
        }
        dummyhead = dummyhead.next;
    }
    dummyhead.next = p !=null ? p : q;

    head = dummyNode.next;
}

void printList(){
    Node curNode = head;
    if(head==null){
        System.out.println("Linkedlist is empty");
    }
    while(curNode!=null){
        System.out.print(curNode.val+" -> ");
        curNode = curNode.next;
        
    }
    System.out.println("Null");
}
}

public class Solution {
    public static void main(String[] args) {
        LList list = new LList();
        LList list1 = new LList();
        LList list2 = new LList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(5);
        list1.printList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(4);
        list2.printList();
        list.mergeList(list1.head, list2.head);
        list.printList();
    }  
}
