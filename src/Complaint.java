public class Complaint {

    private int id;
    private String studentName;
    private String category;
    private String subject;
    private String description;
    private String status;

    public Complaint(int id, String studentName, String category,
                     String subject, String description) {

        this.id = id;
        this.studentName = studentName;
        this.category = category;
        this.subject = subject;
        this.description = description;
        this.status = "Pending";
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCategory() {
        return category;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {

        System.out.println("\n-----------------------------");
        System.out.println("Complaint ID : " + id);
        System.out.println("Student      : " + studentName);
        System.out.println("Category     : " + category);
        System.out.println("Subject      : " + subject);
        System.out.println("Description  : " + description);
        System.out.println("Status       : " + status);
        System.out.println("-----------------------------");
    }
}