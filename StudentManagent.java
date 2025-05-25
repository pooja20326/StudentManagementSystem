import java.util.*;
class student 
{
    int id;
    String name;
    String Department;
    student(int id,String name, String Department)
    {
        this.id=id;
        this.name=name;
        this.Department=Department;
    }
    void display()
    {
        System.out.println("ID" +id +"name"+ name+ "Department"+ Department);
    }
}
public class StudentManagent
{
public static void main(String[] args) 
{
   Scanner sc=new Scanner(System.in);
   ArrayList<student> students=new ArrayList<>(10);
   //Simple login  System
   final String USERNAME="Admin";
   final String Password="123@#";
   System.out.println("Welcome to the Student management System...");
   boolean loggedin=false;
   while(!loggedin)
   {
    System.out.println("Enter UserName");
   }
}
}

    
