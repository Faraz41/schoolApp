import java.util.Scanner;

public class ZevarSchoolApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ZevarManagement management = new ZevarManagement();
        int choice ;


        do {
            System.out.println("Welcome to Zevar school management App ");
            System.out.println(" PLease choose from the followin option ");
            System.out.println("1- Add Student ");
            System.out.println("2- View all Student ");
            System.out.println("3- Update a Student ");
            System.out.println("4- Delete a Student ");
            System.out.println("0- to Exit from App");

        choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter Student name ");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Enter Student age ");
                int age = scan.nextInt();
                Student s = new Student(name, age);
                management.addStudent(s);
                break;
            case 2:
                management.readStudents();
                break;
            case 3:
                management.updateStudent();
                break;
            case 4 :
                management.deleteStudent();
                System.out.println("choose from the list to delete student ");
                break;
            case 0:
                System.out.println(" Exit the Application, Bye ");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, Please try again ");
        }
        }while (true);
    }
}

