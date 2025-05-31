package VisitorDesignPattern.Task.GraphConnectionTypes;

import VisitorDesignPattern.Task.GraphConnectionTypes.Connection;

class Canal implements Connection {
    public String kind() {
        return "Waterway";
    }
}