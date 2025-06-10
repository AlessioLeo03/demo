package com.example.demo.exception;

public class Throw {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Example of throwing a custom exception
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}
