package VisitorDesignPattern.Task.GraphConnectionTypes;

import VisitorDesignPattern.Task.GraphConnectionTypes.Connection;

class Road implements Connection {
    public String kind() {
        return "Road";
    }
}