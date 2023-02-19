package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Magazine extends Document {
    private int totalReleases;
    private short releaseMonth;

    public Magazine(int id, String publisherName, int releaseAmount, int typeOfDocument, int totalReleases, short releaseMonth) {
        super(id, publisherName, releaseAmount, typeOfDocument);

        this.totalReleases = totalReleases;
        this.releaseMonth = releaseMonth;
    }

    @Override
    protected void ToString() {
        System.out.println();

        System.out.println("ID: " + getId());
        System.out.println("Publish Name: " + getPublisherName());
        System.out.println("Release Amount: " + getReleaseAmount());
        System.out.println("Total Release: " + getTotalReleases());
        System.out.println("Release Month: " + getReleaseMonth());
    }
}
