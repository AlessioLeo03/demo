package com.example.demo.exception;
/*
Quando il codice dentro il blocco try genera un’eccezione (ad esempio, divisione per zero, accesso a un array fuori indice, oppure un throw esplicito), Java interrompe immediatamente l’esecuzione del blocco try nel punto in cui si verifica l’errore.

A quel punto, il sistema di gestione delle eccezioni di Java cerca un blocco catch che sia in grado di gestire quell’esatto tipo di eccezione (o una sua superclasse).
Se lo trova, esegue il codice dentro il blocco catch.
Se non lo trova, l’eccezione “risale” la catena dei metodi (stack trace) fino a trovare un gestore, oppure il programma termina con errore.*/
public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numeri = {1, 2, 3};
            System.out.println(numeri[3]); // Qui si genera ArrayIndexOutOfBoundsException
            System.out.println("Questa riga NON viene eseguita se maggiore di 2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hai provato ad accedere a un indice non valido!");
        }
        System.out.println("Programma continua...");
    }
}
