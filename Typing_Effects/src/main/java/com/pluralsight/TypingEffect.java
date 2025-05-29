package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TypingEffect {

    public static void main(String[] args) {
        String message = "Welcome to One Heck of a Sandwich!";
        typeOut(message, 50); // 50ms delay per character
    }

    public static void typeOut(String message, int delayMillis) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            System.out.flush(); // ensures the character is printed immediately
            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nTyping was interrupted.");
                break;
            }
        }
        System.out.println(); // move to next line after the message
    }
}