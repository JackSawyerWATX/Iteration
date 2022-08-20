import java.util.Iterator;

public class NodeStack implements Iterable<Node>{
    private Node top;
    
    public void push(int element){
        Node node = new Node(element);
        push(node);
    }

    public void push(Node node){
        node.setNext(top);
        this.top = (node);
    }

    public Node pop() {
        Node poppedNode = top;
        top = top.getNext();
        poppedNode.setNext(null);
        return poppedNode;
    }

    public Node peek() {
        return top;
    }

    @Override 
    public Iterator<Node> iterator() {
        return new NodeStackIterator(this);
    }

}
