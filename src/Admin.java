import java.util.Scanner;

public class Admin {

    private Scanner scanner;
    private ComplaintManager manager;

    public Admin(Scanner scanner,
                 ComplaintManager manager) {

        this.scanner = scanner;
        this.manager = manager;
    }

    public void menu() {

        while (true) {

            System.out.println("\n===== ADMIN MENU =====");

            System.out.println("1. View All Complaints");
            System.out.println("2. Search Complaint");
            System.out.println("3. Update Complaint Status");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    manager.viewAllComplaints();
                    break;

                case 2:
                    searchComplaint();
                    break;

                case 3:
                    updateStatus();
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

    private void searchComplaint() {

        System.out.print(
                "\nEnter Complaint ID: "
        );

        int id = scanner.nextInt();
        scanner.nextLine();

        manager.searchComplaint(id);
    }

    private void updateStatus() {

        System.out.print(
                "\nEnter Complaint ID: "
        );

        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nSelect Status:");

        System.out.println("1. Pending");
        System.out.println("2. In Progress");
        System.out.println("3. Resolved");
        System.out.println("4. Rejected");

        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String status;

        switch (choice) {

            case 1:
                status = "Pending";
                break;

            case 2:
                status = "In Progress";
                break;

            case 3:
                status = "Resolved";
                break;

            case 4:
                status = "Rejected";
                break;

            default:
                System.out.println(
                        "Invalid status!"
                );
                return;
        }

        manager.updateStatus(id, status);
    }
}
