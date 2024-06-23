package tutorials.linkedList;


public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(10);
//        list.insertFirst(17);
//
//        list.insertLast(99);
//
//        list.insertAt(100, 3);
//        list.display();
//
//        int val = list.deleteAt(3);
//        list.display();
//        System.out.println(val);

//        DLL list = new DLL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(10);
//        list.insertFirst(17);
//
//        list.insertLast(99);
//
//
//        list.insertAfter(8, 65);
//        list.display();


//        CLL list = new CLL();
//
//        list.insert(3);
//        list.insert(2);
//        list.insert(8);
//        list.insert(10);
//        list.insert(17);
//        list.display();
//        list.display();


        QuestionLL list = new QuestionLL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(10);
        list.display();
        list.insertRec(17,2);

        list.display();


    }
}
