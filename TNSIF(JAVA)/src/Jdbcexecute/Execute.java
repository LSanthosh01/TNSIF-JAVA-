package Jdbcexecute;
import java.util.*;
import Jdbccontroller.Jdbccontrol;
public class Execute {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char c;
		do
		{
			System.out.println("CRUD OPERATIONS \n======================");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.UPDATE EMPLOYEE");
			System.out.println("3.DELETE EMPLOYEE");
			System.out.println("4.SHOW EMPLOYEES");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice(1-5):");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the employee name and salary:");
				Jdbccontrol.create(sc.next(),sc.nextDouble());
				break;
				
			case 2:
				System.out.println("Enter the ID,name,salary of the employee:");
				Jdbccontrol.update(sc.nextInt(),sc.next(),sc.nextDouble());
				break;
				
			case 3:
				System.out.println("Enter the employee ID:");
				Jdbccontrol.delete(sc.nextInt());
				break;
				
			case 4:
				System.out.println("======================================");
				System.out.println("\tEMPLOYEES DETAILS");
				System.out.println("======================================");
				Jdbccontrol.display();
				break;
				
			default:
				System.out.println("PLEASE enter the valid choice");
			}
			System.out.println("Do you want to continue?press(y/n):");
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}

}
