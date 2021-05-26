/* 
Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty (
) operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack
*/

package OOPSAssignmentMay26;

import java.util.Scanner;

public class Stack {
    private int stack[];
    private int top;
    int size;

    Stack(int size){
        stack = new int[size];
        this.size = size;
        top = -1;
    }

    private boolean checkFull(){
        
        return top == size-1;
    }

    boolean checkEmpty(){
        return top == -1;
    }

    boolean push(int data){
        if( this.checkFull() ){
            return false;
        }
        stack[++top] = data;
        return true;
    }

    int pop(){
        if( this.checkEmpty() ){
            System.out.println("Stack is Already Empty!");
            return -1;
        }
        return stack[top--];
    }

    int capacity(){
        return top+1;
    }
}


class UserProgram{
    public static void main(String[] args) {
        Stack stack1 = new Stack(2);
        Stack stack2 = new Stack(2);
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Choose the stack to perform operations:\n\t1.stack1\n\t2.Stack2");
            int ch = input.nextInt();
            Stack stack;
            if(ch==1){
                stack = stack1;
            }else if(ch==2){
                stack=stack2;
            }else{
                System.out.println("Enter Valid Input");
                continue;
            }
            System.out.println("Choose Operations to Perform\n\t1.Push\n\t2.Pop\n\t3.Is Stack Empty?\n\t4.Exit Program");
            int option = input.nextInt();
            switch(option){
                case 1: System.out.println("Enter value : ");
                        int data = input.nextInt();
                        boolean status = stack.push(data);
                        if(!status){
                            System.out.println("Stack is full.");
                        }
                        if(stack1.capacity() == stack2.capacity()){
                            System.out.println("The Number of Stack in Stack1 : "+stack1.capacity()+"\nThe Number of Stack in Stack2 : "+stack1.capacity());
                        }
                        break;
                case 2: int x = stack.pop();
                        if(x!=-1){
                            System.out.println("Popped Element: "+x);
                        }
                        if(stack1.capacity() == stack2.capacity()){
                            System.out.println("The Number of Stack in Stack1 : "+stack1.capacity()+"\nThe Number of Stack in Stack2 : "+stack1.capacity());
                        }
                        break;
                case 3: boolean isEmpty = stack.checkEmpty();
                        if(isEmpty){
                            System.out.println("Stack is Empty");
                        }else{  
                            System.out.println("Not Empty");
                        }
                        break;
                case 4: System.exit(1);
                        break;
                default:System.out.println("Enter Valid Option");
                        break;   
            }
        } 
        // input.close();
    }
}