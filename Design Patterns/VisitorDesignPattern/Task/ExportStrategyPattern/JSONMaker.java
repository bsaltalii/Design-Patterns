package VisitorDesignPattern.Task.ExportStrategyPattern;

import VisitorDesignPattern.Task.CompositeStructure.GraphElement;
import VisitorDesignPattern.Task.CompositeStructure.GraphGroup;
import VisitorDesignPattern.Task.ExportStrategyPattern.Exporter;

class JSONMaker implements Exporter {
    public String make(GraphGroup g) {
        StringBuilder result = new StringBuilder("{\"nodes\":[");
        for (GraphElement e : g.elements()) {
            result.append("\"" + e.details() + "\",");
        }
        if (!g.elements().isEmpty()) result.setLength(result.length() - 1);
        result.append("]}");
        return result.toString();
    }
}