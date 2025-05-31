package VisitorDesignPattern.Task.ExportStrategyPattern;

import VisitorDesignPattern.Task.CompositeStructure.GraphElement;
import VisitorDesignPattern.Task.CompositeStructure.GraphGroup;
import VisitorDesignPattern.Task.ExportStrategyPattern.Exporter;

class XMLMaker implements Exporter {
    public String make(GraphGroup g) {
        StringBuilder result = new StringBuilder("<graph>\n");
        for (GraphElement e : g.elements()) {
            result.append("  <node type=\"" + e.details() + "\" />\n");
        }
        result.append("</graph>");
        return result.toString();
    }
}