import java.util.ArrayList;

public class ComplaintManager {

    private ArrayList<Complaint> complaints;
    private int nextId;

    public ComplaintManager() {

        complaints = new ArrayList<>();
        nextId = 1;
    }

    public void addComplaint(String studentName,
                             String category,
                             String subject,
                             String description) {

        Complaint complaint = new Complaint(
                nextId,
                studentName,
                category,
                subject,
                description
        );

        complaints.add(complaint);

        System.out.println(
                "\nComplaint submitted successfully!"
        );

        System.out.println(
                "Complaint ID: " + nextId
        );

        nextId++;
    }

    public void viewAllComplaints() {

        if (complaints.isEmpty()) {

            System.out.println(
                    "\nNo complaints available."
            );

            return;
        }

        for (Complaint complaint : complaints) {
            complaint.display();
        }
    }

    public void searchComplaint(int id) {

        for (Complaint complaint : complaints) {

            if (complaint.getId() == id) {

                complaint.display();
                return;
            }
        }

        System.out.println(
                "\nComplaint not found."
        );
    }

    public void updateStatus(int id, String status) {

        for (Complaint complaint : complaints) {

            if (complaint.getId() == id) {

                complaint.setStatus(status);

                System.out.println(
                        "\nComplaint status updated!"
                );

                return;
            }
        }

        System.out.println(
                "\nComplaint not found."
        );
    }
}