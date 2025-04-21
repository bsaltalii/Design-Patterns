package FactoryMethod.DocumentExporterExample;

public class WordExporter implements DocumentExporter{
    @Override
    public void export(String content) {
        System.out.println("Word document exporting , content : "+content);
    }
}
