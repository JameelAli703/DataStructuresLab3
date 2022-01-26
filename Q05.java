package DSA_LAB_03;

public class Q05 {
    public static void main(String[] args) {
        String[] value ={"ABC","ABD","ABC","ABS","ABC"};
        for (int i=0; i<value.length-1; i++){
            if (value[i].equals(value[i + 2])){
                System.out.println(value[i]+" and Index is "+i);
            }
        }
    }
}
