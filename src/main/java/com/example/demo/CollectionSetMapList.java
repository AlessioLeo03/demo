package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class CollectionSetMapList {

	public static void main(String[] args) {
		/*
		List (es. ArrayList, LinkedList): mantiene l’ordine di inserimento, permette duplicati, accesso tramite indice.
		Set (es. HashSet, LinkedHashSet, TreeSet): non permette duplicati, non garantisce l’ordine (tranne LinkedHashSet e TreeSet).
		Map (es. HashMap, LinkedHashMap, TreeMap): associa chiavi a valori, non permette chiavi duplicate.*/
		SpringApplication.run(CollectionSetMapList.class, args);
		List<Character> lista = new ArrayList<>();
		lista.add('A');
		lista.add('B');
		lista.add('A'); // Duplicato permesso

		Set<String> insieme = new HashSet<>();
		insieme.add("A");
		insieme.add("B");
		insieme.add("A"); // Duplicato ignorato

		Map<Integer, String> mappa = new HashMap<>();
		mappa.put(1, "Uno");
		mappa.put(2, "Due");
		mappa.put(1, "Uno nuovo"); // Sovrascrive il valore precedente

		System.out.println("Lista: " + lista);
		System.out.println("Insieme: " + insieme);
		System.out.println("Mappa: " + mappa);
	}
}
