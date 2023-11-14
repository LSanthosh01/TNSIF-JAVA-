package Lambda;
import java.util.*;
class Person {
    int age;
    String name;

    public Person(int age,String name) {
        this.age=age;
        this.name=name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person=>{"+age+","+name+"}";
    }
}

public class Sorting {
    public static void main(String[] args) {
        List<Person>p=new ArrayList<Person>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the name for person"+(i + 1)+":");
            String name=sc.next();
            System.out.println("Enter the age for person "+(i + 1)+":");
            int age=sc.nextInt();
            Person person=new Person(age,name);
            p.add(person);
        }
        p.sort((Person p1,Person p2)->p1.getAge()-p2.getAge());
        p.forEach((s)->System.out.println(s));
    }
}