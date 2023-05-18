package kr.hs.dgsw.java.list;

public class MyList {
    private Node head;

    public void add(String value) {
        Node node = new Node();
        node.setValue(value);

        Node prev = getLastNode();
        if (prev == null) {
            head = node;
        } else {
            prev.setNext(node);
        }
    }

    public String get(int index) {
        Node node = head;

        for (int i = 0 ; i < index ; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }

            node = node.getNext();
        }

        return node.getValue();
    }

    public String remove(int index) {
        Node node = head;
        Node prev = null;

        for (int i = 0 ; i < index ; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }

            prev = node;
            node = node.getNext();
        }

        if (prev != null) {
            prev.setNext(node.getNext());
        } else {
            
        }

        return node.getValue();
    }

    public int size() {
        Node node = head;

        int size = 0;
        while (node != null) {
            node = node.getNext();
            size++;
        }

        return size;
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }

        Node node = head;
        while (true) {
            if (node.getNext() == null) {
                return node;
            }
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList();

        list.add("Korea");
        list.add("USA");
        list.add("Japan");
        list.add("China");

        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}
