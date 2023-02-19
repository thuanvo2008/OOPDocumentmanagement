package org.example;

import lombok.*;

@Getter
@Setter
public class Book extends Document{
    private String authorName;
    private int totalPages;

    public Book(int id, String publisherName, int releaseAmount, int typeOfDocument, String authorName, int totalPages) {
        super(id, publisherName, releaseAmount, typeOfDocument);

        this.authorName = authorName;
        this.totalPages = totalPages;
    }

    @Override
    protected void ToString() {
        System.out.println();

        System.out.println("ID: " + getId());
        System.out.println("Publish Name: " + getPublisherName());
        System.out.println("Release Amount: " + getReleaseAmount());
        System.out.println("Author Name: " + getAuthorName());
        System.out.println("Total Pages: " + getTotalPages());
    }
}
