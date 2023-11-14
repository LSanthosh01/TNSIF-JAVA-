package Arrays;
import java.util.Scanner;
public class MaxDifference {
	  public static void main(String[] args) {
	        int i,maxdiff=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("How many numbers you want to enter:");
	        int n=sc.nextInt();
	        int num[]=new int[n];
	        System.out.println("Enter the numbers:");
	        for(i=0;i<n;i++){
	            num[i]=sc.nextInt();
	        }
	        int l=num[0];
	        int s=num[0];
	        for(i=1;i<num.length;i++){
	            if(num[i]>l)
	            {
	                l=num[i];
	            } 
	            else if(num[i]<s)
	            {
	            	s=num[i];
	            }
	        }
	        maxdiff=l-s;
	        System.out.println("The smallest element is:"+s);
	        System.out.println("The largest element is:"+l);
	        System.out.println("The maximum difference is:"+maxdiff);
	  }
}
