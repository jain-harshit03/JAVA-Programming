import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pijlab1 {

    public static void main(String[] args) throws IOException {
       pijlab1 obj = new pijlab1();
       int choice1 = obj.formatchoice();
       int choice2 = obj.functionchoice();
       switch (choice1){
           case 1:
               int n1 = obj.scn();
               switch(choice2){
                   case 1:
                       int x = obj.factorial(n1);
                       System.out.println("The factorial of the no. "+n1+" is :"+x);
                       break;
                   case 2:
                       obj.fib(n1);
                       break;
                   default:
                       System.out.println("Wrong choice");

               }
               break;
           case 2:
               int n2 = obj.buff();
               switch(choice2){
                   case 1:
                       int y = obj.factorial(n2);
                       System.out.println("The factorial of the no. "+n2+" is :"+y);
                       break;
                   case 2:
                       obj.fib(n2);
                       break;
                   default:
                       System.out.println("Wrong choice");
                       break;

               }
               break;
           case 3:
               int n3 = obj.cmd(args);
               switch(choice2){
                   case 1:
                       int a = obj.factorial(n3);
                       System.out.println("The factorial of the no. "+n3+" is :"+a);
                       break;
                   case 2:
                       obj.fib(n3);
                       break;
                   default:
                       System.out.println("Wrong choice");
                       break;

               }
               break;
           case 4:
               int n4 = obj.dis();
               switch(choice2){
                   case 1:
                       int z = obj.factorial(n4);
                       System.out.println("The factorial of the no. "+n4+" is :"+z);
                       break;
                   case 2:
                       obj.fib(n4);
                       break;
                   default:
                       System.out.println("Wrong choice");
                       break;

               }
               break;
           case 5:
               int n5 = obj.cons();
               switch(choice2){
                   case 1:
                       int b = obj.factorial(n5);
                       System.out.println("The factorial of the no. "+n5+" is :"+b);
                       break;
                   case 2:
                       obj.fib(n5);
                       break;
                   default:
                       System.out.println("Wrong choice");
                       break;

               }
               break;
           default:
               System.out.println("Wrong Choice");
               break;

       }

    }
    int functionchoice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the function you want to perform");
        System.out.println("1: Factorial");
        System.out.println("2: Fibonacci");
        System.out.println("Enter your choice :");
        int choice2 = in.nextInt();
        return choice2;
    }
    int formatchoice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose Your Input Format");
        System.out.println("Choice 1 : Scanner");
        System.out.println("Choice 2 : BufferedReader");
        System.out.println("Choice 3 : Command line args");
        System.out.println("Choice 4 : DataInputStream");
        System.out.println("Choice 5 : Console");
        System.out.println("Enter Your Choice :");
        int choice1 = in.nextInt();
        return choice1;
    }

    int scn() {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NO. \t");
        n = in.nextInt();
        return n;
    }

    int buff() {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(ip);
        int n=0; int num=0;
        try {
            System.out.println("Enter the no.");
            String nm = b.readLine();
            n = Integer.parseInt(nm);
            num=n;

        } catch (IOException e) {
        }
        return num;
    }
    int cmd(String[] args){
        int num=0; int n=0;
        for(String str: args) {
            n = Integer.parseInt(str);
            num=n;
        }
        return num;
    }
    int dis(){
        DataInputStream diss = new DataInputStream(System.in);
        StringBuffer inputLine = new StringBuffer();
        String tmp; int n=0; int num=0;
        try {
            System.out.println("Enter the no.");
            while ((tmp = diss.readLine()) != null) {
                inputLine.append(tmp);
                n = Integer.parseInt(tmp);
                num = n;
                break;
            }
            diss.close();
        }
        catch (IOException e){
        }
        return num;
    }

    int cons(){
        System.out.println("Enter the no.");
        String name = System.console().readLine();
        int n = Integer.parseInt(name);
        return n;
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    void fib(int n) {
        System.out.println("Fibonacci series is :");
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
