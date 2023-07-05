import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class post_eval{
    static boolean isop(char ch)
    {
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void evalexp(String exp)
    {
        Stack<Integer>st=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++)
        {
            if(isop(exp.charAt(i))){
                int op1=st.pop();
                int op2=st.pop();
                switch(exp.charAt(i))
                {
                    case '+':
                    {
                        st.push(op2+op1);
                        break;
                    }
                    case '-':
                    {
                        st.push(op2-op1);
                        break;
                    }
                    case '*':
                    {
                        st.push(op2*op1);
                        break;
                    }
                    case '/':
                    {
                        st.push(op2/op1);
                        break;
                    }
                }

            }
            else
            {
                int operand=exp.charAt(i)-'0';
                st.push(operand);
            }
        }
        System.out.println(st.pop());
    }
    public static void main(String [] args)
    {
        System.out.println("Enter expression:\n");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("The Postfix Evaluation for the given expression"+str+"is: " );
        evalexp(str);
    }
}