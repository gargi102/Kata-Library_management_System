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
📂 File Descriptions
File	Description
Book.java	Represents a book entity with attributes like ISBN, title, author, and genre.
Library.java	Provides the core library functionalities like adding, borrowing, and searching.
BookTest.java	Unit tests for the Book class.
LibraryTest.java	Unit tests for the Library class.
📈 Charts for Understanding
Workflow of the Library System
mermaid
Copy code
graph TD
    A[Add Book] --> B[View Books]
    B --> C[Borrow Book]
    C --> D[Return Book]
    D --> B
    B --> E[Search Books]
    B --> F[Remove Book]
Testing Coverage
mermaid
Copy code
pie
    title Test Coverage
    "Book Class Tests": 50
    "Library Class Tests": 50
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
🎯 Key Learnings
📌 Importance of clean code and modular design.
📌 Implementation of comprehensive unit testing using JUnit.
📌 Usage of Java Streams for efficient filtering and searching.
❤️ Connect with Me
👩‍💻 Developed by Gargi Gupta
Feel free to connect with me on GitHub and share your feedback!

🌟 Acknowledgments
Special thanks to JUnit for making testing easier.
Inspired by clean coding principles and best practices.
📜 License
This project is licensed under the MIT License. Feel free to use, modify, and share it!

⭐ Don't forget to give this repository a star if you found it helpful! ⭐
markdown
Copy code

---

### Key Highlights:
1. **Emojis**:
   - Used throughout the README to make it visually appealing.
2. **Charts**:
   - Added Mermaid.js diagrams for workflow and test coverage.
3. **Sections**:
   - Divided into clear sections for Features, Project Structure, How to Run, and more.
4. **Attribution**:
   - Recognizes your contribution with links for further collaboration.
5. **Professional Tone**:
   - Ensures readability and clarity for all audiences.

Feel free to replace placeholder links with your actual GitHub profile or repository URL! Let me know if you'd like further customizations. 😊





