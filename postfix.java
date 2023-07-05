import java.util.Scanner;
import java.util.Stack;

public class postfix {
    static boolean isop(char ch){
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            return true;
        }
        else {
            return false;
        }
    }
    static void eval(String exp){
        Stack<Integer>st=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            if(isop(exp.charAt(i))){
                int op1=st.pop();
                int op2=st.pop();
                switch(exp.charAt(i)){
                    case'+':st.push(op1+op2);
                    break;
                    case '-':st.push(op1 - op2);
                    break;
                    case '*':st.push(op1 * op2);
                    break;
                    case '/':st.push(op1 / op2);
                    break;
                }
            }
            else{
                int operand=exp.charAt(i)-'0';
                st.push(operand);
            }
        }
        System.out.println(st.pop());
    }
    public static void main(String [] args){
        System.out.println("Enter your expression:");
        try (Scanner s = new Scanner(System.in)) {
            String str=s.next();
            System.out.println("Evaluated expression:");
            eval(str);
        }
    }
}
