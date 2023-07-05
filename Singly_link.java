class Singly_link {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void insert_front(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    public void delete_before1 (int pos){
        Node cur=head;
        for(int i=0; i<pos-1;i++){
            cur=cur.next;
        }
        System.out.print("Deleted element is: "+cur.next.data);
        cur.next=cur.next.next;
    }

    public void insert_last(int i) {
        Node temp = new Node(i);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = temp;
            tail = temp;
        }
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("Nothing to delete");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node cur = head;
                while (cur.next != tail) {
                    cur = cur.next;
                }
                cur.next = null;
                tail = cur;
            }
        }
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.print("null\n");
    }

    public void delete_front() {
        if (head == null) {
            System.out.print("Nothing to delete");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public void search(int val) {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            if (cur.data == val) {
                System.out.print("Found at pos: " + count + "\n");
            }
            cur = cur.next;
        }
    }

    public int len() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void insert_pos(int count, int value) {
        Node temp = new Node(value);
        Node cur = head;
        Node next1 = cur.next;
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            if (count == 1) {
                temp.next = head;
                head = temp;
            } else {
                for (int i = 2; i < count; i++) {
                    cur = cur.next;
                    next1 = next1.next;
                }
                if (cur == tail) {
                    cur.next = temp;
                    tail = cur;
                } else {
                    temp.next = cur.next;
                    cur.next = temp;
                }
            }
        }
    }

    public void delete_before(int pos) {
        if (pos == 1) {
            System.out.print("Can't delete");
        } else if (pos > len()) {
            Node cur = head;
            while (cur.next != tail) {
                cur = cur.next;
            }
            cur.next = null;
            tail = cur;
        } else {
            Node prev = null;
            Node del = head;
            Node cur = head.next;
            for (int i = 2; i <= pos; i++) {
                prev = del;
                del = cur;
                cur = cur.next;
            }
            prev.next = cur;
        }
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node n;
        while (cur != null) {
            n=cur.next;
            cur.next=prev;
            prev=cur;
            cur=n;
        }
        tail=head;
        head=prev;
    }

    public static void main(String[] args) {
        Singly_link s = new Singly_link();
        s.insert_front(13);
        s.insert_front(14);
        s.insert_last(15);
        s.insert_last(18);
        s.insert_last(19);
        s.insert_last(21);
        s.display();
        s.delete_last();
        s.display();
        s.delete_front();
        s.display();
        s.search(11);
        System.out.print("Length of LL:" + s.len() + "\n");
        s.insert_pos(2, 16);
        s.display();
        s.delete_before(3);
        s.display();
        s.delete_before1(3);
        s.display();
    }
}