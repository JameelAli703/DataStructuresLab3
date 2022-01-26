package DSA_LAB_03;

public class Q10 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,7};
        int count = 0, num=0;
        for (int i = 0; i<a.length; i++){
            if (a[i]!=i+1){
                count++;
                num = a[i-1]+count;
                break;
            }
        }
        if (count>0){
            System.out.println("The Missing Number is : "+num);
        }
    }
}
