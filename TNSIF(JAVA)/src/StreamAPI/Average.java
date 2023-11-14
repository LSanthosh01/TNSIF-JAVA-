package StreamAPI;

import java.util.*;
public class Average {
	public static void main(String[] args) {
		List<Double>doubles=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements:");
        int n=sc.nextInt();
        System.out.println("Enter the doubles:");
        for (int i=0;i<n;i++) {
            double value=sc.nextDouble();
            doubles.add(value);
        }
        double sum=doubles.stream()
                .mapToDouble(d->d)
                .reduce(0.0,(a,b)->a+b);
        double average=sum/doubles.size();
        System.out.println("Average:" + average);

	}

}
