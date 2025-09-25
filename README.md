# 📚 Library Management System (Java OOP)

A console-based Library Management System built with pure Java, demonstrating Object-Oriented Programming principles, file handling, and exception management. This project mimics real-world software engineering practices using file-based data persistence.

## 🚀 Features

- **Book Management**: Add, view, and search books
- **Member Management**: Register and manage library members  
- **Borrowing System**: Check books in/out with availability tracking
- **Data Persistence**: All data stored in text files (no database required)
- **Exception Handling**: Robust error handling for file operations
- **Console Interface**: User-friendly menu-driven interface

## 🛠️ Technical Stack

- **Java** (Core OOP Concepts)
- **File I/O** (Data Persistence)
- **Exception Handling**
- **Collections Framework** (ArrayList)
- **Scanner Class** (User Input)

## 📁 Project Structure
LibraryManagementSystem/
├── data/ # Data storage (simulated database)
│ ├── books.txt # Book records
│ ├── members.txt # Member records
│ └── transactions.txt # Borrowing history
├── src/
│ ├── models/ # Entity classes
│ │ ├── Book.java
│ │ ├── Member.java
│ │ └── Transaction.java
│ ├── services/ # Business logic layer
│ │ ├── BookService.java
│ │ ├── MemberService.java
│ │ └── TransactionService.java
│ └── LibraryApp.java # Main application class
└── README.md
