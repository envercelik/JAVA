package B05InterfaceAndAbstractClass.P4Examples.Example3;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String datas = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney";
        String[] data = datas.split(" ");

        for (String s:data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());


        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


        String[] data2 = stringData.split(" ");
        for (String s : data2) {
            tree.addItem(new Node(s));
        }


        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());



    }
}
