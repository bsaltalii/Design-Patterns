package VisitorDesignPattern.Task.CompositeStructure;

import VisitorDesignPattern.Task.CompositeStructure.GraphElement;
import VisitorDesignPattern.Task.GraphNodeTypes.Node;

class NodeItem extends GraphElement {
    private final Node node;

    NodeItem(Node node) {
        this.node = node;
    }

    public String details() {
        return node.type();
    }
}