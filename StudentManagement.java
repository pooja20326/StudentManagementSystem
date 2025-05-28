import java.util.*;

 class StudentManagement
{
public static void main(String[] args) 
{
   Scanner sc=new Scanner(System.in);
   ArrayList<Student> students=new ArrayList<>(10);
   //Simple login  System
   final String USERNAME="Admin";
   final String Password="123@#";
   System.out.println("Welcome to the Student management System...");
   boolean loggedin=false;
   while(!loggedin)
   {
    System.out.println("Enter UserName");
    String user=sc.nextLine();
    System.out.println("Enter Password");
    String pass= sc.nextLine();
    
    if (user.equals(USERNAME)&&pass.equals(Password))
    {
            
    loggedin=true;
    System.out.println("Logged Successfully");
    } 
    else
{
System.out.println("Invalid credential. Please try again!!!");
}
}
     
while(true)
{
    System.out.println("\n -----------Student Mangement System-------------");
    System.out.println("1. Add All Student");
    System.out.println("2. View All Student");
    System.out.println("3. Search Student By  id");
    System.out.println("4. Exit");
    System.out.println("Choose an Option");
    int  choice=sc.nextInt();
    sc.nextLine();
    switch(choice)
    {
        case 1:
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter name of the Student");
        String name=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the Department of the student");
        String Dept=sc.nextLine();
        students.add(new Student(id, name, Dept));
        System.out.println("Students added Sucessfully");
        break;
        case 2:
        System.out.println("list of Student");
        for (Student s: students)
        {
            s.display();
        }
        break;
        case 3:
        System.out.println("Enter id to Search");
        int searchid=sc.nextInt();
        boolean found=false;
        for(Student s:students )
        {
            if(s.id==searchid)
            {    s.display();
                found=true;
                break;
            }
            
        }
        if(!found)
        {
            System.out.println("student not found");
        }
        break;
        case 4:
        System.out.println("Exiting System......!!");
        return;
         default:
    
    System.out.println("Invalid Option try Again....!!!!!!!!!");
    }
   
}
}
}
class Student 
{
    int id;
    String name;
    String Department;
    Student(int id,String name, String Department)
    {
        this.id=id;
        this.name=name;
        this.Department=Department;
    }
    void display()
    {
        System.out.println("ID   " +id +"name   "+ name+ "Department  "+ Department);
    }
}


    
