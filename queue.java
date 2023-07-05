public class queue {
    public int front,rear,size;
    public int arr[];
    queue(int n){
        size=n;
        front=-1;
        rear=-1;
        arr=new int[size];
    }
    public void enq(int x){
        if(rear==size-1){
            System.out.print("The queue is full\n");
        }
        
        else{
            if(front==-1 && rear==-1){
            rear=0;
            front=0;
            }
            else{
            rear++;
            }
            arr[rear] = x;
        }
    }
    public void deq(){
        if(front==-1 && rear==-1 || front > rear){
            System.out.print("The queue is empty\n");
        }
        else{
            if(front==0 && rear==0){
            System.out.print("Element deleted is: "+arr[front]+"\n");
            rear=-1;
            front=-1;
        }
        else{
            System.out.print("Element deleted is: " + arr[front]+"\n");
            front++;}
        }
    }
    public void front(){
        if(front==-1){
            System.out.println("Empty");
        }
        else{
            System.out.print("Top value: "+arr[front]+"\n");
        }
    }
    public void display(){
        if(front==-1 || front > rear){
            System.out.print("Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String [] args){
        queue q1=new queue(5);
        q1.display();
        q1.enq(13);
        q1.enq(32);
        q1.enq(43);
        q1.front();
        q1.display();
        q1.deq();
        q1.deq();
        q1.display();
        q1.deq();
        q1.deq();
        q1.display();
    }
}
