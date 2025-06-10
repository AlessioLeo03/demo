package com.example.demo.collection;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
       /* Gli Stream sono stati introdotti in Java 8 e permettono di lavorare con le collezioni in modo dichiarativo e funzionale, facilitando operazioni come filtrare, trasformare, ordinare e aggregare dati.
         Caratteristiche principali degli Stream:
       - Non modificano la collezione originale: Gli stream lavorano su una "vista" dei dati.
       - Possono essere sequenziali o paralleli: Gli stream paralleli sfruttano più core della CPU.
       - Supportano operazioni intermedie e terminali: Le operazioni intermedie (come filter, map, sorted) restituiscono un nuovo stream, mentre le operazioni terminali (come collect, forEach, count) producono un risultato o un effetto collaterale.
        */
        List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sommaQuadratiPari = numeri.stream()
                .filter(n -> n % 2 == 0)      // Prende solo i numeri pari
                .map(n -> n * n)              // Eleva al quadrato
                .reduce(0, Integer::sum);     // Somma tutti i risultati
        System.out.println("Somma dei quadrati dei numeri pari: " + sommaQuadratiPari);



        /*
        Gli stream in Java non modificano mai la collezione di partenza. Sono progettati per essere non mutabili:
        lavorano su una “vista” dei dati, producendo risultati nuovi senza cambiare l’originale.

        Operazioni intermedie:
        Sono operazioni che restituiscono sempre un nuovo stream, permettendo di concatenare più operazioni una dopo l’altra (come una “pipeline”).
        Esempi: filter, map, sorted, distinct, limit, skip.
        Queste operazioni sono lazy, cioè non vengono eseguite finché non si incontra un’operazione terminale.
        Operazione terminale:
        È l’operazione che chiude la pipeline e produce un risultato (un valore, una collezione, o un effetto collaterale). Dopo una terminale, lo stream non può più essere usato.
        Esempi: collect, forEach, reduce, count, anyMatch, allMatch, findFirst.

        Operazioni più comuni sugli Stream:
       - filter(Predicate): filtra gli elementi secondo una condizione
       - map(Function): trasforma ogni elemento
       - sorted(): ordina gli elementi
       - collect(Collector): raccoglie i risultati in una nuova collezione
       - forEach(Consumer): esegue un’azione su ogni elemento
       - reduce(...): riduce gli elementi a un singolo valore (somma, prodotto, concatenazione, ecc.)
       */
    }
}
