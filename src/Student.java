import java.util.Scanner;

public class Student {

    private Scanner scanner;
    private ComplaintManager manager;

    public Student(Scanner scanner,
                   ComplaintManager manager) {

        this.scanner = scanner;
        this.manager = manager;
    }

    public void menu() {

        while (true) {

            System.out.println("\n===== STUDENT MENU =====");

            System.out.println("1. Submit Complaint");
            System.out.println("2. Search Complaint");
            System.out.println("3. View All Complaints");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    submitComplaint();
                    break;

                case 2:
                    searchComplaint();
                    break;

                case 3:
                    manager.viewAllComplaints();
                    break;

                case 4:
                    return;

                default:
                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }

    private void submitComplaint() {

        System.out.println("\n===== SUBMIT COMPLAINT =====");

        System.out.print("Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        manager.addComplaint(
                name,
                category,
                subject,
                description
        );
    }

    private void searchComplaint() {

        System.out.print(
                "\nEnter Complaint ID: "
        );

        int id = scanner.nextInt();
        scanner.nextLine();

        manager.searchComplaint(id);
    }
}
