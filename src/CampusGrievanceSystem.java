import java.util.Scanner;

public class CampusGrievanceSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ComplaintManager manager =
                new ComplaintManager();

        Student student =
                new Student(scanner, manager);

        Admin admin =
                new Admin(scanner, manager);

        while (true) {

            System.out.println("\n================================");
            System.out.println("   CAMPUS GRIEVANCE SYSTEM");
            System.out.println("================================");

            System.out.println("1. Student");
            System.out.println("2. Admin");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    student.menu();
                    break;

                case 2:
                    admin.menu();
                    break;

                case 3:

                    System.out.println(
                            "\nThank you!"
                    );

                    scanner.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }
}