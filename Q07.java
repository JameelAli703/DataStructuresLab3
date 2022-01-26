package DSA_LAB_03;

import java.util.Scanner;

public class Q07 {
    //Take 10 character inputs from a user and store them in an array and print its ASCII
    //values on the screen.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the elements of an array : ");
        int n= sc.nextInt();
        char arr[]= new char[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter : "+(i+1)+" : ");
            arr[i]= sc. next(). charAt(0);
        }
        for (int i=0;i<n;i++){
            int ASCII = arr[i];
            System.out.println("ASCII value for "+arr[i]+" is : "+ASCII);
        }

    }
}
