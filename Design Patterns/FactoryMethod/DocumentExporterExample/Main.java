package FactoryMethod.DocumentExporterExample;

public class Main {
    public static void main(String[] args) {
        DocumentExporter exporter = new WordExporter();
        exporter.export("Word document");

        exporter = new PdfExporter();
        exporter.export("Pdf document");
    }
}
