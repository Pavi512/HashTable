# Hash Table

A Java console-based application that demonstrates the implementation of a Hash Table using Linked Lists and Arrays of Linked Lists. The project focuses on understanding hashing techniques, collision handling, and word frequency analysis through practical use cases. The implementation is organized using a Git feature branch workflow, where each enhancement is developed independently and merged into the development branch.

---

## About the Project

A Hash Table is a data structure that stores key-value pairs and provides efficient insertion, deletion, and searching operations using a hash function. This project demonstrates the implementation of a custom Hash Table in Java without using Java's built-in `HashMap`.

The application begins by counting the frequency of words in a sentence using a Linked List-based Hash Table. It is then extended to process paragraphs using an Array of Linked Lists for collision handling. Finally, the application demonstrates updating the Hash Table by removing an avoidable word and recalculating the frequency of the remaining words.

Each use case is implemented in a separate feature branch and merged into the `dev` branch after successful implementation and testing.

---

## Topics Covered

- Hash Table
- Hash Function
- Collision Handling
- Linked List
- Array of Linked Lists
- Word Frequency Counting
- Searching
- Deletion
- Object-Oriented Programming

---

## Project Highlights

- Custom Hash Table implementation
- Word frequency calculation
- Collision handling using Linked Lists
- Array of Linked Lists implementation
- Removal of words from the Hash Table
- Feature branch development workflow
- Modular Java implementation

---

## Use Cases Implemented

| Use Case | Description |
|----------|-------------|
| UC1 | Implement a Hash Table using Linked Lists and count the frequency of each word in a sentence |
| UC2 | Implement a Hash Table using an Array of Linked Lists and count the frequency of each word in a paragraph |
| UC3 | Remove an avoidable word from the paragraph and display the updated word frequencies |

---

## Features

- Custom Hash Table implementation
- Word frequency analysis
- Collision handling using Linked Lists
- Paragraph processing
- Remove words from the Hash Table
- Beginner-friendly implementation
- Modular Java code

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Data Structures and Algorithms
- Linked List
- Hashing
- Git
- GitHub

---

## Project Structure

```text
HashTable/
│
├── src/
│   └── com/
│       └── bridgelabz/
│           └── hashtable/
│               └── HashTable.java
│
├── README.md
└── .gitignore
```

---

## Objectives

- Understand the Hash Table data structure.
- Learn hashing and collision handling techniques.
- Implement a custom Hash Table in Java.
- Count word frequencies efficiently.
- Strengthen problem-solving skills using hashing techniques.

---

## How to Run

### Clone the Repository

```bash
git clone https://github.com/Pavi512/HashTable.git
```

### Navigate to the Project Directory

```bash
cd HashTable
```

### Compile

```bash
javac src/com/bridgelabz/hashtable/HashTable.java
```

### Run

```bash
java com.bridgelabz.hashtable.HashTable
```

---

## Time Complexity

| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Search | O(1) | O(n) |
| Insert | O(1) | O(n) |
| Delete | O(1) | O(n) |
| Update Frequency | O(1) | O(n) |

The average-case complexity assumes a good hash function with minimal collisions.

---

## Git Workflow

The project follows a feature branch workflow.

- main – Initial project setup
- dev – Development branch
- feature/UC1
- feature/UC2
- feature/UC3

Each feature branch introduces a new Hash Table operation. After implementation and testing, the feature branch is merged into the `dev` branch, ensuring incremental development and a clean Git history.

---

## Learning Outcomes

After completing this project, you will be able to:

- Understand the Hash Table data structure.
- Implement hashing without using Java's built-in `HashMap`.
- Handle collisions using Linked Lists.
- Count and update word frequencies efficiently.
- Analyze the performance of Hash Table operations.
- Apply Object-Oriented Programming principles to data structures.
- Follow a Git feature branch development workflow.

---

## Repository

This repository demonstrates the implementation of a custom Hash Table through incremental development. Each use case extends the previous implementation by introducing new hashing techniques and operations, making it a valuable learning resource for understanding Hash Tables, collision handling, and word frequency analysis.

---

## License

This project is intended for educational and learning purposes.

---

## Author

Gondi Pavithra

GitHub: https://github.com/Pavi512
