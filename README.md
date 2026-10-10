# Contact Book Management System

A simple Java-based console application for managing personal contacts. The project allows users to add, search, update, remove, and display contacts in an in-memory contact list.

## Overview

This project demonstrates core Java concepts such as:

- Classes and objects
- Encapsulation
- ArrayList collection usage
- Menu-driven console applications
- Basic CRUD operations (Create, Read, Update, Delete)

The application is organized into three main classes:

- `Contact`: represents a single person/contact
- `ContactBook`: stores and manipulates contact records
- `ContactBookTest`: provides a command-line interface

## Project Structure

```text
ContactBook_Management/
└── ContactBookmanagementSystem/
    ├── .classpath
    ├── .gitignore
    ├── .project
    ├── .settings/
    └── src/
        └── com/
            └── version2/
                ├── Contact.java
                ├── ContactBook.java
                └── ContactBookTest.java
```

## Features

- Add a new contact
- Show all contacts
- Search for a contact by mobile number
- Update a contact's name
- Update a contact's email
- Remove a contact
- Prevent duplicate mobile numbers
- Exit the application

## Class Details

### 1. Contact

This class represents a contact with the following attributes:

- `name`
- `email`
- `mobile`

It includes getter and setter methods and overrides `toString()` to print contact details in a readable format.

### 2. ContactBook

This class contains the main logic for managing contacts. It uses an `ArrayList<Contact>` to store all contact entries.

Key methods:

- `addContact(Contact contact)`
- `removeContact(String mobile)`
- `updateNameContact(String name, String phone)`
- `updateEmailContact(String email, String phone)`
- `showContacts()`
- `searchContact(String mobile)`

The class also checks for duplicate mobile numbers before adding a new contact.

### 3. ContactBookTest

This is the main class with the `main` method. It creates a menu-driven interface using `Scanner` and lets the user choose actions from the console.

## Menu Options

The application displays a menu similar to the following:

```text
********************************
****** Welcome to Contact Book ********
****** 1. Add Contacts           ********
****** 2. Show Contacts          ********
****** 3. Search Contacts        ********
****** 4. Update Contact Name    ********
****** 5. Update Contact Email   ********
****** 6. Remove Contact         ********
****** 7. Exit                  ********
********************************
```

## How to Run

### Using Eclipse

1. Open Eclipse IDE.
2. Import the `ContactBookmanagementSystem` project.
3. Locate `src/com/version2/ContactBookTest.java`.
4. Run it as a Java application.

### Using Command Line

Navigate to the project directory and compile the Java files:

```bash
javac src/com/version2/*.java
```

Then run the application:

```bash
java -cp src com.version2.ContactBookTest
```

## Example Usage

```text
Enter Name: John
Enter email: john@example.com
Enter Mobile: 9876543210
```

The program will add the contact and store it in the list. Later, you can search for the contact using the mobile number or display all contacts in the book.

## Notes

- This is an in-memory project; contacts are not saved permanently.
- Data will be lost when the program closes.
- Duplicate phone numbers are not allowed.

## Future Improvements

Potential enhancements for this project include:

- Saving contacts to a file
- Loading contacts from a file at startup
- Searching contacts by name
- Sorting contacts alphabetically
- Adding email and phone validation
- Migrating to a graphical user interface (GUI)

## License

This project is intended for educational and learning purposes. If a specific license is added later, it will be reflected in the repository.

## Conclusion

The Contact Book Management System is a beginner-friendly Java project that helps learners understand object-oriented programming, collections, and interactive console applications. It is a great starting point for building more advanced applications in the future.
