public class Single_List {
    static Node head;
    static Node tail;
    class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    void insertlast(int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            Node cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
            }
            cur.next=temp;
            tail=temp;
        }

    }
    void insertfront(int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            tail=temp;
        }
        temp.next=head;
        head=temp;
    }
    void count(){
        int count=0;
        if(head==null){
            System.out.print("Empty");
        }
        Node cur=head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        System.out.print("The number of nodes in the linked list are: "+count+"\n");
    }
    void deletelast(){
        if(head==null){
            System.out.println("Nothing to delete");
        }
        else{
            Node cur=head;
            while(cur.next!=tail){
                cur=cur.next;
            }
            cur.next=null;
            tail=cur;
        }
    }
    void deletefront(){
        if(head==null){
            System.out.print("Empty");
        }
        else{
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
            }
        }
    }
    void deleteafter(int key){
        if(head==null||head==tail){
            System.out.print("Nothing to delete");
        }
        else{
            Node cur=head;
            while(cur.data!=key){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
    }
    void search(int key){
        if(head==null){
            System.out.print("Element not found");
        }
        else{
            Node cur=head;
            while(cur!=null){
                if(cur.data==key){
                    System.out.print("found");
                }
                cur=cur.next;
            }
        }
    }
    void insertbf(int key,int val){
        Node temp=new Node(val);
        Node cur=head;
        Node prev=null;
        if(head==null){
            System.out.print("Cant insert");
        }
        else{
            if(head==tail){
                temp.next=head;
                head=temp;
            }
            else{
                while(cur.data!=key){
                    cur=cur.next;
                    prev=prev.next;
                }
                temp.next=prev.next;
                prev.next=temp;
            }
        }
    }
    void skip(){
        
    }
    void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.print("\n");
    }
    public static void main(String [] args){
        Single_List s=new Single_List();
        s.insertlast(2);
        s.insertlast(4);
        s.insertlast(5);
        s.insertfront(10);
        s.insertlast(13);
        s.insertlast(15);
        s.display();
        s.insertfront(6);
        s.insertfront(7);
        s.display();
        s.count();
        s.deletefront();
        s.deletefront();
        s.display();
        s.deletelast();
        s.deletelast();
        s.display();
        s.deleteafter(10);
        s.display();
        s.search(5);

    }
}
