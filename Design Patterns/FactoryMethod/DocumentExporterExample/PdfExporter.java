package FactoryMethod.DocumentExporterExample;

public class PdfExporter implements DocumentExporter{
    @Override
    public void export(String content) {
        System.out.println("Pdf document : exporting , content : "+content);
    }
}
