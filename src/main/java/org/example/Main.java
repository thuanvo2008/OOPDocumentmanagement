package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Document> documents = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Document Management Store!");

        boolean isForever = true;

        while (isForever) {
            System.out.println("1. Enter information about documents");
            System.out.println("2. Find documents");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1 -> InsertDocument();
                case 2 -> FindDocument();
                case 3 -> isForever = false;
            }
        }
    }

    public static void InsertDocument() {

        System.out.print("Insert amount documents: ");
        int soTaiLieu = scanner.nextInt();

        for (int i = 0; i < soTaiLieu; i++) {

            System.out.println("1 - Book");
            System.out.println("2 - Magazine");
            System.out.println("3 - NewsPaper");

            System.out.print("Insert type of document: ");
            int typeOfDocument = scanner.nextInt();

            if (typeOfDocument < 1 || typeOfDocument > 3){
                System.out.println("Invalid type of document");
                i--;
                continue;
            }

            System.out.print("Insert publisher name: ");
            String publisherName = scanner.next();

            System.out.print("Insert release amount: ");
            int releaseNumber = scanner.nextInt();

            switch (typeOfDocument) {
                case 1 -> {
                    System.out.print("Insert author name: ");
                    String authorName = scanner.next();

                    System.out.print("Insert total pages: ");
                    int totalPages = scanner.nextInt();

                    Book book = new Book(documents.size() + 1,
                            publisherName,
                            releaseNumber,
                            typeOfDocument,
                            authorName,
                            totalPages
                    );

                    documents.add(book);
                }

                case 2 -> {
                    System.out.print("Insert total releases: ");
                    int totalReleases = scanner.nextInt();

                    System.out.print("Insert release month: ");
                    short releaseMonth = scanner.nextShort();

                    Magazine magazine = new Magazine(documents.size() + 1,
                            publisherName,
                            releaseNumber,
                            typeOfDocument,
                            totalReleases,
                            releaseMonth
                    );

                    documents.add(magazine);
                }

                case 3 -> {
                    System.out.print("Insert release day: ");
                    short releaseDay = scanner.nextShort();

                    NewsPaper newsPaper = new NewsPaper(documents.size() + 1,
                            publisherName,
                            releaseNumber,
                            typeOfDocument,
                            releaseDay
                    );

                    documents.add(newsPaper);
                }
            }
        }
    }

    public static void FindDocument() {
        System.out.println("=== Find Document ===");
        System.out.println("1. Get one by type");
        System.out.println("2. Get one by id");

        System.out.print("Insert your choice: ");
        short choice = scanner.nextShort();

        switch (choice) {
            case 1 -> getOneByType();
            case 2 -> getOneByID();
            default -> System.out.println("Invalid choice");
        }

    }

    private static void getOneByType() {
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. NewsPaper");

        System.out.print("Insert type you wanna find: ");
        short type = scanner.nextShort();

        List<Document> list = documents.stream().
                filter(document -> document.getTypeOfDocument() == type).
                toList();

        for (Document ls : list) {
            ls.ToString();
        }
    }

    private static void getOneByID() {
        System.out.print("Insert ID you wanna find: ");
        int id = scanner.nextInt();

        List<Document> list = documents.
                stream().
                filter(document -> document.getId() == id).
                toList();

        for (Document ls : list) {
            ls.ToString();
        }
    }
}