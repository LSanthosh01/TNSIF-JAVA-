package Arrays;
import java.util.*;
public class Distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String result="";
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++) {
            boolean isDistinct=true;
            for(int j=0;j<i;j++) {
                if(arr[i]==arr[j]) {
                    isDistinct=false;
                    break; 
                }
            }
            if(isDistinct) 
            {
                result+=arr[i]+" ";
            }
        }
        System.out.println("Distinct elements in the array:"+result);
    }
}

