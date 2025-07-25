package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList(1);

        myDll.append(2);
        myDll.append(3);
        myDll.append(4);


//        System.out.println(myDll.removeLast().value);
//        myDll.PrintList();

//        myDll.prepend(3);
//        myDll.PrintList();

//        System.out.println( myDll.removeFirst().value);

//        System.out.println(myDll.get(1).value);
//        myDll.PrintList();

//        myDll.set(3,5);
//        myDll.PrintList();

//         myDll.insert(1,1);
//        myDll.PrintList();

        myDll.remove(2);
        myDll.PrintList();

    }
}
