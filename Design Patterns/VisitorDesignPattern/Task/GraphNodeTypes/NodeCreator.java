
class NodeCreator {
    public static Node getNode(String name) {
        return switch (name.toLowerCase()) {
            case "tree" -> new Tree();
            case "house" -> new House();
            case "facility" -> new Facility();
            default -> throw new RuntimeException("Unknown node type");
        };
    }
}
