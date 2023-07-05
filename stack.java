class stack {
    public int arr[];
    public int top;
    public int size;

    stack(int n) {
        top = -1;
        size=n;
        arr = new int[size];
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.print("Cannot insert element\n");
        } else {
            System.out.println("Inserted: " + x+"\n");
            arr[++top] = x;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Empty\n");
        } else {
            System.out.println("The element deleted is: " + arr[top]+"\n");
            top = top - 1;
        }
    }

    public void fillup() {
        System.out.print("The number of elements present are: " + top+"\n");
    }

    public void isempty() {
        if (top == -1) {
            System.out.println("Stack is empty\n");
        } else {
            System.out.print("The stack is not empty\n");
        }
    }

    public void isfull() {
        if (top == size - 1) {
            System.out.println("Stack is full\n");
        } else {
            System.out.print("It is not full\n");
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        stack s1 = new stack(6);
        s1.isempty();
        s1.push(11);
        s1.push(43);
        s1.push(64);
        s1.fillup();
        s1.isfull();
        s1.display();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.isempty();
        s1.pop();
        s1.push(23);
        s1.display();
    }
}