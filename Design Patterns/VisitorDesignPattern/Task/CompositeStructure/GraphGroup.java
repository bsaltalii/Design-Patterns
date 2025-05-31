package VisitorDesignPattern.Task.CompositeStructure;
import VisitorDesignPattern.Task.CompositeStructure.GraphElement;

import java.util.*;
class GraphGroup extends GraphElement {
    private final List<GraphElement> list = new ArrayList<>();

    public void add(GraphElement g) {
        list.add(g);
    }

    public void remove(GraphElement g) {
        list.remove(g);
    }

    public List<GraphElement> elements() {
        return list;
    }

    public String details() {
        return list.stream().map(GraphElement::details).reduce("", (a, b) -> a + b + ", ");
    }
}