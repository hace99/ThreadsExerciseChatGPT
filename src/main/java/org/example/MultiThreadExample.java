package org.example;

import java.util.Scanner;

public class MultiThreadExample {
    public static void main(String[] args) {
        // Utilizza un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Richiedi all'utente di inserire il numero di thread da creare
        System.out.print("Inserisci il numero di thread da creare: ");
        int numThreads = scanner.nextInt();

        // Crea un array per memorizzare i thread
        MyThread[] threads = new MyThread[numThreads];

        // Crea e avvia i thread
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        // Attendi la terminazione di tutti i thread
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Stampare 'main termina' dopo la terminazione di tutti i thread
        System.out.println("main termina");

        // Chiudi lo scanner
        scanner.close();
    }
}

class MyThread extends Thread {
    private final int myID;

    public MyThread(int myID) {
        this.myID = myID;
    }

    @Override
    public void run() {
        // Stampa l'identificatore del thread tre volte
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + myID);
        }
    }
}