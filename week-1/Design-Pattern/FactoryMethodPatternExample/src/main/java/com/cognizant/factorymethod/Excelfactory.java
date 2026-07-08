package com.cognizant.factorymethod;

public class Excelfactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
