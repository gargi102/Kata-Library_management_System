# 📚 Library Management System

Welcome to the **Library Management System** project! This is a comprehensive Java application designed to manage a library's collection of books, including functionalities for adding, borrowing, returning, and searching books. Built with robust testing and clean code practices, this project is perfect for demonstrating practical software development skills.

---

## 👩‍💻 Developed by: Gargi Gupta

---

## ✨ Features

- 📖 Add books with details like title, author, genre, and publication year.
- 🧾 Search for books by title, author, or genre.
- 🔄 Borrow and return books with tracking of borrower details.
- 🔍 View all available or borrowed books.
- 🚮 Remove books from the library.
- ✅ Fully unit-tested using JUnit for quality assurance.

---

## 📊 Project Structure

Here's an overview of the key components of the project:

```plaintext
LibraryManagementSystem/
├── src/
│   ├── models/
│   │   └── Book.java        # Represents a book entity
│   ├── services/
│   │   └── Library.java     # Core library functionality
│   └── tests/
│       ├── BookTest.java    # Unit tests for Book class
│       └── LibraryTest.java # Unit tests for Library class
└── README.md                # Project documentation
🚀 How to Run the Project
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/LibraryManagementSystem.git
Compile the project:

bash
Copy code
javac -d out src/**/*.java
Run the application:

bash
Copy code
java -cp out services.Library
Run tests: Ensure JUnit is set up, then execute test cases:

bash
Copy code
java -cp .:junit-5.10.0.jar:out org.junit.runner.JUnitCore tests.LibraryTest

🧪 Test Cases
Here are some highlights of the test cases implemented:

BookTest.java
✅ Validate book creation with all attributes.
✅ Test updating book details.
✅ Ensure correct availability status for borrowing/returning.
LibraryTest.java
✅ Validate adding books with unique ISBNs.
✅ Test borrowing books by different users.
✅ Handle errors for invalid operations like borrowing non-existent books.

👩‍💻 Developed by Gargi Gupta
Feel free to connect with me on GitHub and share your feedback!

⭐ Don't forget to give this repository a star if you found it helpful! ⭐
markdown






