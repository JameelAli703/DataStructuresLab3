package DSA_LAB_03;
import java.util.Arrays;
import java.util.Scanner;
//Take the input string values (Like Ali, Ahmed, Fiza, Rafeeq) from a user and save the 
//values into an array and finally reverse the string values.
public class Q04 {
    public static void main(String[] args) {
        String names [] =new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
           names[i] = sc.next();
        }
        String names2[]= Arrays.copyOf(names,5);
        for (int j=4; j>=0; j--){
            System.out.println(names2[j]);
        }
    }
}
