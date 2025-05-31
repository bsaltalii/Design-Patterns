package VisitorDesignPattern.Task.ExportStrategyPattern;


import VisitorDesignPattern.Task.CompositeStructure.GraphGroup;
import VisitorDesignPattern.Task.ExportStrategyPattern.Exporter;

class ExportManager {
    private Exporter exporter;

    public void set(Exporter exporter) {
        this.exporter = exporter;
    }

    public String export(GraphGroup g) {
        if (exporter == null) throw new IllegalStateException("No exporter set");
        return exporter.make(g);
    }
}