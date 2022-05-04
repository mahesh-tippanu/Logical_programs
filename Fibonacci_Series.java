package Logical_programing;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args){

        int a=0,b=1,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of terms n: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }

}
