package FactoryMethod.DocumentExporterExample;

public class PdfExporterFactory implements ExporterFactory{
    @Override
    public DocumentExporter exporter() {
        return new PdfExporter();
    }
}
