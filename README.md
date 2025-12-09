# Dealership Management System

## Description of the Project
The Dealership Management System is a Java console application designed to help users efficiently manage a vehicle 
dealership’s inventory, sales, and lease transactions. The program allows users to view available vehicles, sell or 
lease vehicles to customers, and automatically track contracts and inventory updates.

## User Stories
- As a user, I want to view all vehicles in the dealership inventory so that I can browse available cars.
- As a user, I want to search for vehicles by make, model, price, year, or mileage so that I can quickly find what I need.
- As a user, I want to purchase a vehicle so that I can own it outright.
- As a user, I want to lease a vehicle so that I can drive a vehicle without buying it.
- As a user, I want the application to automatically calculate sales and lease costs so that pricing is accurate.
- As a user, I want the system to save all sales and lease contracts so that transaction records are not lost.
- As a user, I want sold or leased vehicles to be automatically removed from inventory so that available stock stays accurate.
- As a developer, I want to use DAO classes to manage data so that the program follows clean architecture and is easy to maintain.

## Setup
Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites
- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK (version 17 or above) is installed and properly configured in IntelliJ.

### Running the Application in IntelliJ
Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the public static void main(String[] args) method.
5. Right-click on the file and select Run 'Main.main()' to start the application.

## Technologies Used
- Java 17
- File I/O (java.io package)
- Scanner
- Object-Oriented Programming (OOP)
- DAO Design Pattern

## Demo Video
[Demo](https://drive.google.com/file/d/1loIE_qvp7dGkeFFK-jInhyxEWTaxmMZ6/view?usp=sharing)

## Future Work

- Implement a graphical user interface (GUI)
- Add database integration instead of file storage
- Add reporting features for sales and lease totals
- Add user authentication and roles (admin vs employee)
