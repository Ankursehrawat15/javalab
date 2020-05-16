public class CreateList {  
    
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    
    public Node head = null;  
    public Node tail = null;  
  
    
    public void add(int data){  
      
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            
            tail.next = newNode;  
            
            tail = newNode;  
              
            tail.next = head;  
        }  
    }  
  
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
           
