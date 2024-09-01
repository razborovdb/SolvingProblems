package amazon.clonegraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {

    Map<Node, Node> changedNodes = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        if (changedNodes.containsKey(node)) {
            return changedNodes.get(node);
        }
        Node newNode = new Node(node.val);
        changedNodes.put(node, newNode);
        for (Node n: node.neighbors) {
            newNode.neighbors.add(cloneGraph(n));
        }
        return newNode;
    }
}
