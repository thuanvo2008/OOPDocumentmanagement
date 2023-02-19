package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Document {
    private int id;
    private String publisherName;
    private int releaseAmount;
    private int typeOfDocument;

    protected abstract void ToString();

}

