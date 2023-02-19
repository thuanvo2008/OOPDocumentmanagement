package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsPaper extends Document {
    private short releaseDay;

    public NewsPaper(int id, String publisherName, int releaseAmount, int typeOfDocument, short releaseDay) {
        super(id, publisherName, releaseAmount, typeOfDocument);

        this.releaseDay = releaseDay;
    }

    @Override
    protected void ToString() {
        System.out.println();

        System.out.println("ID: " + getId());
        System.out.println("Publish Name: " + getPublisherName());
        System.out.println("Release Amount: " + getReleaseAmount());
        System.out.println("Release Day: " + getReleaseDay());
    }
}
