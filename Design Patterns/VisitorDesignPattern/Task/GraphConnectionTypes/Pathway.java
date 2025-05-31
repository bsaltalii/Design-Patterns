package VisitorDesignPattern.Task.GraphConnectionTypes;

import VisitorDesignPattern.Task.GraphConnectionTypes.Connection;

class Pathway implements Connection {
    public String kind() {
        return "Pedestrian Path";
    }
}