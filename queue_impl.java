import java.util.*;
public class queue_impl {
    int front=-1,rear=-1,s=10;
    int [] arr=new int[s];
    public void enqueue(int a)
    {
        if(rear==s-1)
        {
            System.out.println("Overflow...\n");
        }
        else{
            if (front == - 1)
        {front = 0;}
        rear = rear + 1;
        arr[rear] = a;
        }
    }
    public void dequeue()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println("Element deleted is: "+arr[front]);
            front++;
        }
    }
    public void display()
    {
        System.out.println("The elements are: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]+"\n");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("Queue implementation\n");
        queue_impl q=new queue_impl();
        int choice=0;
        Scanner read=new Scanner(System.in);
        while(choice!=4)
        {
            System.out.println("Enter your option:\n");
            System.out.println("1.Enqueue()\n 2.Dequeue()\n 3.Display()\n 4.Exit()\n");
            choice=read.nextInt();
            switch(choice)
            {
                case 1:
                {
                    int a;
                    System.out.println("Enter the value:");
                    a=read.nextInt();
                    q.enqueue(a);
                    break;
                }
                case 2:
                {
                    q.dequeue();
                    break;
                }
                case 3:
                {
                    q.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    break;
                }
            }

        }
    }
}
