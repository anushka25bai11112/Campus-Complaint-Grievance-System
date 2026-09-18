# 🎓 Campus Grievance System

A simple **Java-based Campus Grievance System** that allows students to submit and track complaints while administrators can view and update complaint statuses.

This project is built using **Core Java and Object-Oriented Programming (OOP)** concepts. It is a console-based application designed as a beginner-friendly college project.

## ✨ Features

### 👨‍🎓 Student

* Submit a new complaint
* Automatically generate a complaint ID
* Search for a complaint using its ID
* View all submitted complaints
* Select complaint categories such as:

  * Academic
  * Hostel
  * Library
  * Transport
  * Infrastructure
  * Faculty
  * Other

### 👨‍💼 Admin

* View all complaints
* Search complaints by ID
* Update complaint status
* Available statuses:

  * Pending
  * In Progress
  * Resolved
  * Rejected

## 🛠️ Technologies Used

* **Java**
* **Core Java**
* **Object-Oriented Programming**
* **ArrayList**
* **Scanner**
* **Java Classes & Objects**
* **Switch Case**
* **Loops & Conditional Statements**

No external frameworks or databases are required.

## 📁 Project Structure

```text
CampusGrievanceSystem/
│
├── src/
│   ├── Complaint.java
│   ├── ComplaintManager.java
│   ├── Student.java
│   ├── Admin.java
│   └── CampusGrievanceSystem.java
│
└── README.md
```

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/CampusGrievanceSystem.git
```

### 2. Open the project

```bash
cd CampusGrievanceSystem
```

### 3. Compile the Java files

```bash
javac -d out src/*.java
```

### 4. Run the application

```bash
java -cp out CampusGrievanceSystem
```

## 💻 Main Menu

```text
================================
   CAMPUS GRIEVANCE SYSTEM
================================

1. Student
2. Admin
3. Exit

Enter choice:
```

## 📋 Example Workflow

### Student

```text
1. Student
      ↓
1. Submit Complaint
      ↓
Enter Student Name
      ↓
Enter Category
      ↓
Enter Subject
      ↓
Enter Description
      ↓
Complaint ID Generated
```

### Admin

```text
2. Admin
      ↓
1. View All Complaints
2. Search Complaint
3. Update Complaint Status
      ↓
Pending
In Progress
Resolved
Rejected
```

## 🧠 OOP Concepts Used

This project demonstrates several important Java concepts:

* **Classes and Objects**
* **Encapsulation**
* **Constructors**
* **Methods**
* **ArrayList**
* **Access Modifiers**
* **Object Interaction**
* **Control Statements**

### Main Classes

| Class                   | Responsibility                   |
| ----------------------- | -------------------------------- |
| `Complaint`             | Stores complaint information     |
| `ComplaintManager`      | Manages complaints               |
| `Student`               | Handles student operations       |
| `Admin`                 | Handles administrator operations |
| `CampusGrievanceSystem` | Main application and menu        |

## 🔮 Future Improvements

Possible future enhancements include:

* Student and admin authentication
* Database integration
* GUI using Java Swing or JavaFX
* Complaint priority levels
* File attachments
* Email notifications
* Complaint history
* Search and filtering
* Admin dashboard
* Complaint analytics and reports

## 🎯 Project Purpose

The purpose of this project is to demonstrate how **Core Java and OOP concepts** can be used to create a simple real-world application for managing campus complaints and grievances.

## 👨‍💻 Author
Anushka Upadhyay

---

⭐ If you found this project useful, consider giving it a star!
