package VisitorDesignPattern.Task.CompositeStructure;

import java.util.*;
abstract class GraphElement {
    public void add(GraphElement g) {}
    public void remove(GraphElement g) {}
    public List<GraphElement> elements() { return List.of(); }
    public abstract String details();
}