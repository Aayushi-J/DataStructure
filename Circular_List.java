public class Circular_List {
    int front;
    int rear;
    int size;
    int arr[];
    Circular_List(int x){
        front=-1;
        rear=-1;
        size=x;
        arr=new int[size];
    }
    void insert_back(int x) {
        if (front == 0 && rear == size - 1 || front == rear + 1) {
            System.out.print("Cant insert");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear=(rear+1)%size;
            }
            arr[rear] = x;
        }
    }
    
    void delete_front() {
        if (front == -1 && rear == -1) {
            System.out.println("Can't be deleted");
        } else {
            if (front == 0 && rear == 0) {
                System.out.println("Deleted: " + arr[front] + "\n");
                front = -1;
                rear = -1;
            } else {
                System.out.println("Deleted: " + arr[front] + "\n");
                front=(front+1)%size;
            }
        }
    }
    void display(){
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n");
    }
    public static void main(String [] args){
        Circular_List c=new Circular_List(5);
        c.insert_back(8);
        c.insert_back(9);
        c.insert_back(3);
        c.insert_back(6);
        c.display();
        c.delete_front();
        c.delete_front();
        c.display();
    }
}
