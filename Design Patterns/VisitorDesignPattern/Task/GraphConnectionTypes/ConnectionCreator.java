package VisitorDesignPattern.Task.GraphConnectionTypes;

import VisitorDesignPattern.Task.GraphConnectionTypes.*;

class ConnectionCreator {
    public static Connection getConnection(String name) {
         switch (name.toLowerCase()) {
            case "bridge" :
                return new Bridge();
            case "road" :
                return new Road();
            case "pedestrian" :
                return new Pathway();
            case "waterway" :
                return new Canal();
            default:
                throw new RuntimeException("Unknown connection type");
        }
    }
}