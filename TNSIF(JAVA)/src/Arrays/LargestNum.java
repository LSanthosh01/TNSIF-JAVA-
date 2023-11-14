package Arrays;
import java.util.*;
import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers you want to enter:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the numbers:");
        for(i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int l=num[0];
        for(i=1;i<num.length;i++){
            if(num[i]>l){
                l=num[i];
            }
        }
        System.out.println("Largest number is:"+l);

    }
}
