package com.example.demo.exception;
/*Tipi di eccezioni
Checked exceptions: devono essere gestite obbligatoriamente (try/catch o throws). Esempi: IOException, SQLException.
Unchecked exceptions: sono sottoclassi di RuntimeException e non è obbligatorio gestirle. Esempi: NullPointerException, ArrayIndexOutOfBoundsException.
Error: sono problemi gravi che normalmente non dovresti gestire (es: OutOfMemoryError).*/

public class ExceptionType {
    public static void main(String[] args) {
        int x = -1; // Modifica questo valore per testare diversi scenari
        try {
            if (x < 0) {
                throw new IllegalArgumentException("x non può essere negativo (" + x + ").");
            }
            int risultato = 10 / 0; // genera ArithmeticException
            System.out.println(risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero!" + e.getMessage());
        } finally {
            System.out.println("Blocco finally eseguito sempre.");
        }
    }
}
