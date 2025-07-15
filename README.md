# 📚 Library Management System (Java)
This is a Java-based Library Management System designed for managing a library's day-to-day operations including book issue/return, student records, and book inventory. Built using Java Swing for the GUI and MySQL for data storage, the application supports multiple library functions in a user-friendly environment.

✨ Features
🔐 Admin Login: Secure login system for library administrators.

📚 Book Management: Add, update, delete books from the inventory.

🙍 Student Management: Maintain records of students who use the library.

📤 Issue/Return Books: Issue and return books with due-date tracking.

💰 Fine Calculation: Auto-calculate fines for late returns.

📊 Transaction History: View logs of all book issues and returns.

🎨 GUI: Built with Java Swing for desktop usability.

🧱 Technologies Used
Language: Java (JDK 8 or higher)

GUI: Java Swing

Database: MySQL

Database Connectivity: JDBC

📁 Project Structure
pgsql
Copy
Edit
LibraryManagementSystem/
├── src/
│   ├── LibraryManagementSystem.java
│   ├── Login.java
│   ├── Dashboard.java
│   ├── AddBook.java
│   ├── IssueBook.java
│   ├── ReturnBook.java
│   ├── StudentManager.java
│   └── DBConnection.java
├── lib/  # JDBC driver (e.g., mysql-connector-java.jar)
├── README.md
└── library_db.sql  # SQL file to set up the database
🛠️ Setup Instructions
1. 📦 Requirements
Java JDK 8 or above

MySQL Server

MySQL JDBC Driver (e.g., mysql-connector-java.jar)

IDE (like IntelliJ IDEA, Eclipse, or NetBeans)

2. 🗃️ Database Setup
Open MySQL and create a database:

sql
Copy
Edit
CREATE DATABASE library_db;
Import the provided library_db.sql file into your MySQL database to create the necessary tables.

3. 🧩 Project Configuration
Open the project in your preferred IDE.

Add the MySQL JDBC driver (mysql-connector-java-x.x.xx.jar) to your project libraries.

Update the DBConnection.java file with your MySQL credentials:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/library_db";
String username = "root";
String password = "your_password";
4. ▶️ Running the Application
Compile and run LibraryManagementSystem.java or the main class that launches the login window.

🔑 Default Admin Credentials (if hardcoded)
text
Copy
Edit
Username: admin
Password: admin123
📌 Notes
Make sure your MySQL server is running before launching the app.

Adjust your JDBC URL if you're using a non-default port or remote database.

Use exception handling and logging for production-level deployments.

🤝 Contribution
Contributions are welcome! You can:

Report bugs

Suggest features

Submit pull requests

Fork the repo and improve the system!

📜 License
This project is open-source and free to use for learning and educational purposes.

