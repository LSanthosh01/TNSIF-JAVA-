package StreamAPI;
import java.util.*;
public class MinMax {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many integers you want to enter:");
        int n=sc.nextInt();
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++) {
        	int num=sc.nextInt();
        	numbers.add(num);
        }
        int max=numbers.stream().max(Integer::compare).orElse(0);
        int min=numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("Maximum integer:"+max);
        System.out.println("Minimum integer:"+min);
	}

}
