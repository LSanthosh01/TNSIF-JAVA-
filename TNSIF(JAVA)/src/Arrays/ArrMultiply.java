package Arrays;
import java.util.*;
public class ArrMultiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of array a:");
        int m1=sc.nextInt();
        System.out.println("Enter the number of columns of array a:");
        int n1=sc.nextInt();
        int a[][]=new int[m1][n1];
        System.out.println("Enter the elements of array a:");
        for(int i=0;i<m1;i++) 
        {
            for(int j=0;j<n1;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of array b:");
        int m2=sc.nextInt();
        System.out.println("Enter the number of columns of array b:");
        int n2=sc.nextInt();
        int b[][]=new int[m2][n2];
        System.out.println("Enter the elements of array b:"); 
        for(int i=0;i<m2;i++) 
        {
            for(int j=0;j<n2;j++) 
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix a:");
        for(int i=0;i<m1;i++) 
        {
            for(int j=0;j<n1;j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix b:");
        for(int i=0;i<m2;i++) 
        {
            for(int j=0;j<n2;j++) 
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        if ((m1!=m2)&&(n1!=n2)) 
        {
            System.out.println("Not valid for multiplication");
        } 
        else 
        {
            int r[][]=new int[m1][n2];
            for(int i=0;i<m1;i++) 
            {
                for(int j=0;j<n2;j++) 
                {
                    for(int k=0;k<n1;k++) 
                    {
                        r[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Result matrix:");
            for(int i=0;i<m1;i++) 
            {
                for(int j=0;j<n2;j++) 
                {
                    System.out.print(r[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

