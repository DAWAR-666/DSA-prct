public class Node {
    int data; 
    Node next; 

    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList() {
        this.head=null;
    }
    
    public int get(int index) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (index < 0 || index >=count) { 
            return -1;
        }
        int ans;
        if (index == 0) {
            return head.data;
        }
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        ans=current.next.data;
        return ans;
    }
    
    public void addAtHead(int val) {
        Node n1=new Node(val);
        if(head==null){
            head=n1;
            return;
        }
        n1.next=head;
        head=n1;

    }
    
    public void addAtTail(int val) {
        Node n1=new Node(val);
        Node temp=head;
        if(head==null){
            head=n1;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }
    
    public void addAtIndex(int index, int val) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (index < 0 || index > count) { // index > size() allows adding at the end
            return;
        }
        Node newNode = new Node(val);
        if (index == 0) {
            newNode.next = head; 
            head = newNode;
            return;
        }
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        
        current.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (index < 0 || index >=count) { // index > size() allows adding at the end
            return ;
        }
        if (count==0) { 
            
            return;
        }
        else if(index==0){
            head=head.next;
            return;
        }
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
       
        current.next=current.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */