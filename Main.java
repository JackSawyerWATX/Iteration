import java.util.Iterator;

class Main {
    public static void main(String[] args) {

        System.out.println();
        int[] intArr = new int[] { 48, 21, 77, 15 };
        System.out.println("standard for loop [array]");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println();
        System.out.println("enhanced for loop [array]");
        for (int a : intArr) {
            System.out.println(a);
        }

        System.out.println();
        NodeStack ns = new NodeStack();
        ns.push(48);
        ns.push(21);
        ns.push(77);
        ns.push(15);
        System.out.println("enhanced for loop [nodestack]");
        for (Node n : ns) {
            System.out.println(n);
        }

        System.out.println();
        System.out.println("iterator using while loop [NodeStack]");
        Iterator iter = ns.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();
    }
}