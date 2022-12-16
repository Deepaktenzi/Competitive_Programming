
class LList{
    int size;
    Node head;
class Node{
    int val;
    Node next;
    

    Node(int data){
        this.val = data;
        this.next = null;
    }
}

// Add Node At First

void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

// Reverse Linked List

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

// Remove Nth From End

void removeNthFromEnd(int n){
    if(head == null) System.out.println("Empty");

    Node node = null;
    node = head;
    
    Node temp = head;
    Node dumy = null;
    temp = head;
    while(node !=null){
        node = node.next;
        size++;
    }

    if(size==n){
        head = head.next;
    }
    else{

    

    System.out.println("Linkedlist Size " + size);
    int pos = size-n;
    while(--pos!=0){
        temp = temp.next;
    }
    temp.next = temp.next.next;
}
    System.out.println(temp.val);
}

// Add Node At Last

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

// Merge Two Sorted List

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

// Print Linked List

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
        list1.addLast(3);
        list1.addLast(4);
        list1.removeNthFromEnd(2);
        list1.printList();
        // list1.printList();
        // list2.addLast(1);
        // list2.addLast(3);
        // list2.addLast(4);
        // list2.addLast(4);
        // list2.printList();
        // list.mergeList(list1.head, list2.head);
        // list.printList();
    }  
}
