import java.util.*;
class Stackarray
{
    private int top;
    private int st[];
    private int max;
    Stackarray(int size){
        top = -1;
        max = size;
        st = new int [max];
    } 
    public void push(int value){
        if(top == max-1)
        {
            System.out.println("Stack overflow");
        }
        else{
            st[++top]=value;
            System.out.println(value+"element pushed into stack");
        }
    }
    public int pop()
    {
        if (top == -1){
            System.out.println("Stack is Underflow");
            return-1;
        }
        else{
            int popelement = st[top--];
            System.out.println("the element poped from stack is"+popelement);
            return popelement ;
        }
    }
    public void display()
    {
         System.out.println("Stack element is printing");
       for(int i =top;i>=0;i--)
       {
       
        System.out.println(st[i]);
       }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your limit:");
        int n = sc.nextInt();
        Stackarray s = new Stackarray(n);
        System.out.print("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
        while(true)
        {
            System.out.println("Enter your choice:");
            int c =sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("enter the element push into Stack:");
                int value = sc.nextInt();
                s.push(value);
                break;
            case 2:
                s.pop();
                break;
            case 3:
                s.display();
                break;
            case 4:
                sc.close();
                return;
                default:
                    System.out.println("Invalid chice try again");
        }
        }
    }
}