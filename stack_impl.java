import java.util.*;
class stack_impl{
    int top=-1;
    int size=10;
    int [] arr=new int[size];
    public void push(int a)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full \n");
        }
        else{
            top++;
            arr[top]=a;
            System.out.println("Item added\n");

        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty\n");
        }
        else{
            System.out.println("Deleted element is: "+arr[top]);
            top--;
        }
    }
    public void display()
    {
        System.out.println("The elements present in the stack are: \n");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public void topval()
    {
        System.out.println("Top value is: "+arr[top]);
    }
    public static void main(String [] args)
    {
        int choice;
        System.out.println("Enter your choice: ");
        Scanner read=new Scanner(System.in);
        choice=read.nextInt();
        stack_impl s=new stack_impl();
        while(choice!=4){
            System.out.println("Enter your option: \n");
            System.out.println("1.Push()\n 2.Pop()\n 3.Display()\n 4. Top value()\n 5.Exit()\n");
            choice=read.nextInt();
            switch(choice)
            {
                case 1:
                {
                    int a;
                    System.out.println("Enter the data: ");
                    a=read.nextInt();
                    s.push(a);
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
                case 4:
                {
                    s.topval();
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting out...");
                    break;
                }
            }
        }
    }
}