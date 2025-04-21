package FactoryMethod.DocumentExporterExample;

public class WordExporterFactory implements ExporterFactory {
    @Override
    public DocumentExporter exporter() {
        return new WordExporter();
    }
}
