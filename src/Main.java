public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

        String StringData = "1 2 3 5 6 8 3 2 7";
        String [] data = StringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }


        list.traverse(list.getRoot());
    }
}
