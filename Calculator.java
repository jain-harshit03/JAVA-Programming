import java.io.*;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,k=0;

        System.out.print("Menu: ");
        System.out.print("\n1)add\n2)sub\n3)mul\n4)div\n5)sqrt\n6)power\n7)mean\n8)variance\n");
        System.out.println("Enter Your Choice: ");
        int i = in.nextInt();
        double first,second;
        double result;
        switch(i)
        {
            case 1:
                System.out.print("Enter first number: ");
                first = in.nextDouble();
                System.out.print("Enter second number: ");
                second = in.nextDouble();
                result = first + second;
                System.out.println("SUM :");
                System.out.println(first+"+"+second+"="+result);
                break;
            case 2:
                System.out.print("Enter first number: ");
                first = in.nextDouble();
                System.out.print("Enter second number: ");
                second = in.nextDouble();
                result = first - second;
                System.out.println("DIFFERENCE :");
                System.out.println(first+"-"+second+"="+result);
                break;
            case 3:
                System.out.print("Enter first number: ");
                first = in.nextDouble();
                System.out.print("Enter second number: ");
                second = in.nextDouble();
                result = first * second;
                System.out.println("MULTIPLICATION :");
                System.out.println(first+"*"+second+"="+result);
                break;
            case 4:
                System.out.print("Enter first number: ");
                first = in.nextDouble();
                System.out.print("Enter second number: ");
                second = in.nextDouble();
                result = first / second;
                System.out.println("DIVISION :");
                System.out.println(first+"/"+second+"="+result);
                break;
            case 5:
                System.out.print("Enter second number: ");
                second = in.nextDouble();
                result = Math.sqrt(second);
                System.out.println("Square root of "+
                        second+"="+ result);
                break;
            case 6:
                System.out.print("Enter first number: ");
                first = in.nextDouble();
                System.out.print("Enter power: ");
                int p = in.nextInt();
                result = Math.pow(first,p);
                System.out.println("Power = "+
                        result);
                break;
            case 7:


                Scanner sc = new Scanner(System.in);
                String s = "";
                int count=0;
                int total=0;
                double avg=0;
                int n;
                System.out.print("Please enter end to stop taking input: ");
                while (true)
                {
                    String input = sc.nextLine();
                    if(input.equals("end"))
                        break;
                    else
                    {
                        n = Integer.parseInt(input);
                        count+=1;
                        total += n;
                        avg=total/n;

                    }

                }
                System.out.println("Mean is "+avg);


            case 8:
                System.out.print("Enter how many numbers you want to enter: ");
                int o = in.nextInt();
                int ar[]=new int[o];
                for(int l=0;l<o;l++)
                {
                    ar[l] = in.nextInt();
                    k=k+ar[l];;
                }
                int mean=k/o;
                double sqDiff = 0;
                for (int q = 0; q < o; q++)
                    sqDiff += (ar[q] - mean) * (ar[q] - mean);
                result=sqDiff/o;
                System.out.println("Variance = "+result);
                break;
            default:
                System.out.println("Wrong choice");
                return;
        }
    }
}
