package DateAPI;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Dateapi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch ='y';
        do {
            System.out.print("Enter a date (YYYY-MM-DD): ");
            String date=sc.nextLine();  
            LocalDate dCheck=parseDate(date);
            if(dCheck!=null) 
            {
            	String result=isWeekend(dCheck);
                System.out.println(dCheck+" is a "+result );
            }
            else 
            {
                System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            }
            System.out.println("Do you want to check another date(y/n):");
            ch=sc.next().charAt(0);
            sc.nextLine(); 
        }while(ch=='y'||ch=='Y');
        sc.close();
    }

    private static LocalDate parseDate(String ds) 
    {
        try {
            DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(ds,format);
        } catch (Exception e) {
            return null;
        }
    }

    private static String isWeekend(LocalDate date) 
    {
        DayOfWeek days=date.getDayOfWeek();
        return (days.equals(DayOfWeek.SATURDAY)||days.equals(DayOfWeek.SUNDAY))?"weekend("+days.toString()+")" : "weekday("+days.toString()+")";
    }
}
