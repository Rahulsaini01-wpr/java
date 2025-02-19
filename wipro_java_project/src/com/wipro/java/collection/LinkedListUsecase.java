package com.wipro.java.collection; 

import java.util.Comparator; 
import java.util.LinkedList; 
import java.util.Scanner; 


// Guest class to store guest details
class Guest {
    String name; // Guest's name
    int age; // Guest's age
    String roomType; // Type of room (Deluxe, Suite, Standard)

    // Constructor to initialize guest details
    public Guest(String name, int age, String roomType) {
        this.name = name;
        this.age = age;
        this.roomType = roomType;
    }

    // Overriding toString() method to display guest details
    @Override
    public String toString() {
        return "Name: " + name + " | Age: " + age + " | Room Type: " + roomType;
    }
}

// Main class for hotel management system
public class LinkedListUsecase {
    public static void main(String[] args) {
        LinkedList<Guest> guestList = new LinkedList<>(); // LinkedList to store guests
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while (true) { // Infinite loop to keep showing the menu
            System.out.println("\n Hotel Management System "); // Display system title
            System.out.println("1. Book Room (Add Guest)"); // Option to add a guest
            System.out.println("2. View Guests"); // Option to view all guests
            System.out.println("3. Search Guest"); // Option to search a guest
            System.out.println("4. Update Guest Details"); // Option to update guest info
            System.out.println("5. Cancel Booking (Remove Guest)"); // Option to remove a guest
            System.out.println("6. Sort Guests (A-Z)"); // Option to sort guests alphabetically
            System.out.println("7. Exit"); // Option to exit the system
            System.out.println("===============================================");// To give a break.
            System.out.print(" Choose an option: ");
            int choice = scanner.nextInt(); // Read user choice
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: // Book a room (add guest)
                    System.out.print("Enter Guest Name: ");
                    String name = scanner.nextLine(); // Read guest name
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt(); // Read guest age
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Room Type (Deluxe/Suite/Standard): ");
                    String roomType = scanner.nextLine(); // Read room type
                    guestList.add(new Guest(name, age, roomType)); // Add guest to the list
                    System.out.println("Room Booked Successfully!");
                    break;

                case 2: // View all guests
                    System.out.println("\n Guest List:");
                    if (guestList.isEmpty()) { // Check if list is empty
                        System.out.println("No Guests Found!");
                    } else {
                        for (Guest g : guestList) { // Loop through all guests
                            System.out.println(g); // Print guest details
                        }
                    }
                    break;

                case 3: // Search guest by name
                    System.out.print("Enter Guest Name to Search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Guest g : guestList) { // Loop through guest list
                        if (g.name.equalsIgnoreCase(searchName)) { // Compare names
                            System.out.println("Guest Found: " + g);
                            found = true;
                            break; // Stop searching after first match
                        }
                    }
                    if (!found) System.out.println("Guest Not Found!");
                    break;

                case 4: // Update guest details
                    System.out.print("Enter Guest Name to Update: ");
                    String updateName = scanner.nextLine();
                    boolean updated = false;
                    for (Guest g : guestList) { // Loop through guests
                        if (g.name.equalsIgnoreCase(updateName)) { // Find matching guest
                            System.out.print("Enter New Age: ");
                            g.age = scanner.nextInt(); // Update age
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter New Room Type: ");
                            g.roomType = scanner.nextLine(); // Update room type
                            System.out.println("Guest Details Updated!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) System.out.println("Guest Not Found!");
                    break;

                case 5: // Remove guest (cancel booking)
                    System.out.print("Enter Guest Name to Cancel Booking: ");
                    String removeName = scanner.nextLine();
                    boolean removed = guestList.removeIf(g -> g.name.equalsIgnoreCase(removeName)); // Remove guest
                    if (removed) {
                        System.out.println("Booking Cancelled!");
                    } else {
                        System.out.println("Guest Not Found!");
                    }
                    break;

                case 6: // Sort guests alphabetically
                    guestList.sort(Comparator.comparing(g -> g.name)); // Sort by name
                    System.out.println("Guests Sorted (A-Z)!");
                    break;

                case 7: // Exit the system
                    System.out.println("Exiting Hotel Management System...");
                    scanner.close(); // Close scanner
                    System.exit(0); // Exit program

                default: // Invalid option
                    System.out.println("Invalid Option! Try Again.");
            }
        }
    }
}
