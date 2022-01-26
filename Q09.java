package DSA_LAB_03;

public class Q09 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,2,3,4,5};
        int count=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==arr1[i]){
                count++;
            }
        }
        if (count==5){
            System.out.println("The arrays are Equal");
        }
        else{
            System.out.println("The arrays are not Equal");
        }

    }
}
