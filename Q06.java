package DSA_LAB_03;

public class Q06 {
    // Find the maximum and minimum length of an array of 30 string values.
    //Hint: Array = {Ali, Ajaz, Ahmed,....Hina} Max: Ahmed = 5 , Min: Ali = 3
    public static void main(String[] args) {
        String [] names = {"Jameeel","Hafsa","Aisha"};
        System.out.print("MaX : ");
        for (int i=0; i<names.length; i++){
            int count = names[i].length();
            System.out.print(names[i]+" : "+count+", ");
        }
    }
}
