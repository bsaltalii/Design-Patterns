package VisitorDesignPattern.Task.ExportStrategyPattern;

import VisitorDesignPattern.Task.CompositeStructure.GraphGroup;

interface Exporter {
    String make(GraphGroup g);
}