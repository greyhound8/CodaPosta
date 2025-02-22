/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject2;
/**
 *
 * @author asocc
 */
import java.util.Scanner;

public class gestore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Coda coda = new Coda();
        String cliente;
        int scelta;

        do {
            System.out.println("Digita 0 per rimuovere il primo elemento");
            System.out.println("Digita 1 per aggiungere un cliente");
            System.out.println("Digita 2 per stampare la coda");
            System.out.println("Digita 3 per uscire dal programma");
            scelta = s.nextInt();

            switch (scelta) {
                case 0 ->
                    coda.Rimuoviintesta();
                case 1 -> {
                    System.out.println("Come si chiama il cliente?");
                    cliente = s.next();
                    coda.aggiungiCliente(cliente);
                }
                case 2 -> coda.stampacoda();
                case 3 -> {
                    System.out.println("Uscita dal programma.");
                    s.close();
                }
                default -> System.out.println("Il valore selezionato non e' previsto.");
            }

        } while (scelta != 3); 
    }
}

