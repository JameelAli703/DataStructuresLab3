package DSA_LAB_03;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        //Take an input value from a user and check the given value from an array that either
        //available or not available in an array and finally find the index of that value
        int b[] = {1, 2, 3, 4, 5};
        System.out.print("Enter The Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                System.out.println(a + " is Present is Array"+" and Index is : "+(i));
            }
        }
    }
}
