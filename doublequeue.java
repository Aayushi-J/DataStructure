public class doublequeue {
    int rear;
    int front;
    int arr[];
    int size;
    doublequeue(int x){
        size=x;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void insert_front(int x){
        if(front==0&&rear==size-1||front==rear+1){
           System.out.print("Cant insert"); 
        }
        else{
            if(front==0){
                front=size-1;
            }
            else if(front==-1&&rear==-1){
                front=0;
                rear=0;
            }
            else{
                front--;
            }
            arr[front]=x;
        }
    }
    
    void insert_back(int x) {
        if (front == 0 && rear == size - 1 || front == rear + 1) {
            System.out.print("Cant insert");
        } else {
            if (rear == size-1) {
                rear=0;
            } else if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = x;
        }
    }
    void delete_front(){
        if(front==-1&&rear==-1){
            System.out.println("Can't be deleted");
        }else{
            if(front==0&&rear==0){
                System.out.println("Deleted: "+arr[front]+"\n");
                front=-1;
                rear=-1;
            }
            else if(front==size-1){
                front=0;
            }
            else{
                System.out.println("Deleted: " + arr[front]+"\n");
                front++;
            }
        }
    }
    
    void delete_last() {
        if (front == -1 && rear == -1) {
            System.out.println("Can't be deleted");
        } else {
            if (front == 0 && rear == 0) {
                System.out.println("Deleted: " + arr[front]+"\n");
                front = -1;
                rear = -1;
            }
            else if(rear==0){
                rear=size-1;
            }
             else {
                System.out.println("Deleted: " + arr[front]+"\n");
                rear--;
            }
        }
    }
    void display()
    {
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n");
    }
    public static void main(String [] args){
        doublequeue d=new doublequeue(5);
        d.insert_front(6);
        d.insert_front(11);
        d.insert_front(7);
        d.insert_back(9);
        d.insert_back(3);
        d.display();
        d.delete_front();
        d.delete_last();
        d.display();
    }
}
