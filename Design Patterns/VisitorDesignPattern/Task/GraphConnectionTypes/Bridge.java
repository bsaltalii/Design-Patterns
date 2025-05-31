package VisitorDesignPattern.Task.GraphConnectionTypes;

import VisitorDesignPattern.Task.GraphConnectionTypes.Connection;

class Bridge implements Connection {
    public String kind() {
        return "Bridge";
    }
}

