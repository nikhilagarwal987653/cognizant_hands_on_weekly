package com.cognizant.factorymethod;

public class Wordfactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
