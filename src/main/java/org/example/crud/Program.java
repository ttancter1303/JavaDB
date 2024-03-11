package org.example.crud;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Student Management System");
        System.out.println("1. Show all student");
        System.out.println("2. Insert a Student");
        System.out.println("3. Update a Student");
        System.out.println("4. Delete a Student");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Show all student");
                break;
            }
            case 2:{
                System.out.println("Insert a Student");
                break;
            }
            case 3:{
                System.out.println("Update a Student");
                break;
            }
            case 4:{
                System.out.println("Delete a Student");
                break;
            }
            case 5:{
                System.out.println("Exit");
                break;
            }
            default:
                break;
        }
    }
}
