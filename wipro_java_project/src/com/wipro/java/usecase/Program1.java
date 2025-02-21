package com.wipro.java.usecase;

import java.util.Scanner;

//Node class for linked list
class Node<T> {
 T data;
 Node<T> next;
 
 Node(T data) {
     this.data = data;
     this.next = null;
 }
}

//Generic Stack class using linked list
class Stack<T> {
 private Node<T> top;
 private int size; // Track size of stack

 // Constructor
 public Stack() {
     top = null;
     size = 0;
 }

 // Push method: Adds an item to the top of the stack
 public void push(T item) {
     Node<T> newNode = new Node<>(item);
     newNode.next = top;
     top = newNode;
     size++;
 }

 // Pop method: Removes and returns the item from the top of the stack
 public T pop() {
     if (isEmpty()) {
         System.out.println("Stack is empty, cannot pop.");
         return null;
     }
     T item = top.data;
     top = top.next;
     size--;
     return item;
 }

 // Peek method: Returns the item from the top of the stack without removing it
 public T peek() {
     if (isEmpty()) {
         System.out.println("Stack is empty, cannot peek.");
         return null;
     }
     return top.data;
 }

 // isEmpty method: Returns true if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }

 // size method: Returns the number of elements in the stack
 public int size() {
     return size;
 }
}

//Main class to test the stack
public class Program1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Integer Stack
     Stack<Integer> integerStack = new Stack<>();
     System.out.println("Enter integers to push onto the stack (enter a non-integer to stop):");
     
     // Read integers until a non-integer is entered
     while (scanner.hasNextInt()) {
         int userInput = scanner.nextInt();
         integerStack.push(userInput);
     }
     
     // Consume the non-integer input
     scanner.next();

     System.out.println("Integer Stack Operations:");
     if (!integerStack.isEmpty()) System.out.println("Peek: " + integerStack.peek());
     if (!integerStack.isEmpty()) System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());
     if (!integerStack.isEmpty()) System.out.println("Pop: " + integerStack.pop());
     if (!integerStack.isEmpty()) System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());

     // Consume the newline character
     scanner.nextLine();
     
     // String Stack
     Stack<String> stringStack = new Stack<>();
     System.out.println("Enter strings to push onto the stack (enter an empty string to stop):");
     
     // Read strings until an empty string is entered
     while (true) {
         String userInput = scanner.nextLine();
         if (userInput.isEmpty()) {
             break;
         }
         stringStack.push(userInput);
     }
     
     // Output results for string stack
     System.out.println("String Stack Operations:");
     if (!stringStack.isEmpty()) System.out.println("Peek: " + stringStack.peek());
     
     scanner.close();
 }
}
