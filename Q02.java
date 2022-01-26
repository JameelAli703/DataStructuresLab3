package DSA_LAB_03;


import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {
        //Remove a specific value from an array in a program.
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0,"0");
        objArray.add(1,"1");
        objArray.add(2,"2");
        System.out.println("Array before removing an element"+objArray);
        objArray.remove(1);
        System.out.println("Array after removing an element"+objArray);
    }
}
