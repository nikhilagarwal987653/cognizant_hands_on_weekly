package com.cognizant.factorymethod;

public class main {
    public static void main(String[] args) {
        DocumentFactory wordfactory= new Wordfactory();
        Document word=wordfactory.createDocument();
        word.open();

        DocumentFactory pdfFactory=new PdfFactory();
        Document pdf=pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory=new Excelfactory();
        Document excel=excelFactory.createDocument();
        excel.open();
    }
}
