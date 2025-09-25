# 📚 Library Management System (Java OOP)

A console-based Library Management System built with pure Java, demonstrating Object-Oriented Programming principles, file handling, and exception management. This project mimics real-world software engineering practices using file-based data persistence.

---

## 🚀 Features

- **Book Management**: Add, view, and search books  
- **Member Management**: Register and manage library members  
- **Borrowing System**: Check books in/out with availability tracking  
- **Data Persistence**: All data stored in text files (no database required)  
- **Exception Handling**: Robust error handling for file operations  
- **Console Interface**: User-friendly menu-driven interface  

---

## 🛠️ Technical Stack

- **Java** (Core OOP Concepts)  
- **File I/O** (Data Persistence)  
- **Exception Handling**  
- **Collections Framework** (ArrayList)  
- **Scanner Class** (User Input)  

---

## 📁 Project Structure
```text
LibraryManagementSystem/
├── data/                   # Data storage (simulated database)
│   ├── books.txt           # Book records
│   ├── members.txt         # Member records
│   └── transactions.txt    # Borrowing history
├── src/
│   ├── models/             # Entity classes
│   │   ├── Book.java
│   │   ├── Member.java
│   │   └── Transaction.java
│   ├── services/           # Business logic layer
│   │   ├── BookService.java
│   │   ├── MemberService.java
│   │   └── TransactionService.java
│   └── LibraryApp.java     # Main application class
├── README.md
└── .gitignore
```
## 🏗️ OOP Concepts Demonstrated

Encapsulation

Keep fields private inside classes (e.g., Book, Member) and expose access via public getters/setters.

Validates and controls how fields are updated (for example ensuring ISBN format or non-empty titles).

Abstraction

BookService, MemberService, and TransactionService expose simple methods (e.g., addBook, searchBook) while hiding file I/O and parsing logic.

Consumers of the services need not know how persistence is implemented.

Inheritance

Design allows extending base classes. Example: a base Member class can be extended by StudentMember and TeacherMember to add role-specific fields or rules.

Shared behavior is kept in the base class to avoid duplication.

Polymorphism

Method overriding: subclasses (e.g., different member types) can override methods like canBorrow() if borrowing rules differ.

Interface usage: define interfaces (e.g., Persistable) to allow different storage strategies (text file, JSON, DB) to be swapped with minimal code changes.

Single Responsibility Principle (SRP)

Each class has one responsibility: models hold data, services handle logic, and LibraryApp handles the UI/menu.

Open/Closed Principle

Services are designed to be extended (open for extension) but closed for modification by using interfaces and clear abstractions.

## 📋 Prerequisites

Java JDK 8 or higher

Any text editor or IDE (IntelliJ IDEA, VS Code, Eclipse)

## 🎯 Usage Examples
Main Menu
Always show details
=== Library Management System ===

1. View all books
2. Add new book
3. Update book
4. Delete book
5. Borrow book
6. Return book
7. View members
8. Register member
9. Exit

Viewing Books
Always show details
--- All Books ---
1. Java Programming by John Smith [Available]
2. Clean Code by Robert Martin [Borrowed]
3. Design Patterns by Gamma et al [Available]

Adding a Book
Always show details
--- Add New Book ---
Title: Effective Java
Author: Joshua Bloch
ISBN: 978-0134685991
Book added successfully!

## 💾 Data Storage Format
Books File (data/books.txt)
Always show details
1|Java Programming|John Smith|978-0134685991|true
2|Clean Code|Robert Martin|978-0132350884|false
3|Design Patterns|Gamma et al|978-0201633610|true


Fields: bookId|title|author|isbn|isAvailable

Members File (data/members.txt)
Always show details
- 101|Alice Johnson|alice@email.com|0831234567
- 102|Bob Williams|bob@email.com|0847654321


Fields: memberId|name|email|phone

Transactions File (data/transactions.txt)
Always show details
txnId|memberId|bookId|borrowDate|returnDate
1|101|1|2025-09-20|2025-09-25
2|102|2|2025-09-21|null



## 👨‍💻 Author

*Muthelo Phindulo*
