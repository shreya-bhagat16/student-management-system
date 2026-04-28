import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student"); 
            System.out.println("4. Update Marks");
System.out.println("5. Exit");


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    dao.addStudent(name, marks);
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
    System.out.print("Enter ID to delete: ");
    int id = sc.nextInt();
    dao.deleteStudent(id);
    break;

case 4:
    System.out.print("Enter ID to update: ");
    int updateId = sc.nextInt();
    System.out.print("Enter new marks: ");
    int newMarks = sc.nextInt();
    dao.updateMarks(updateId, newMarks);
    break;

case 5:
    System.exit(0);
            }
        }
    }
}