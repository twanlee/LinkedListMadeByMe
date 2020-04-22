public class Test {
    public static void main(String[] args) {
        LinkedListMadeByMe<String> myList = new LinkedListMadeByMe<>();
        myList.addFirst("1");
        myList.addFirst("2");
        myList.addFirst("3");
        myList.show();
        myList.add(2,"444");
        System.out.println("===========");
        myList.show();
        myList.removeLast();
        System.out.println("=========");
        myList.show();
        myList.remove(1);
        System.out.println("=========");
        myList.show();
    }
}
