public class Test {
    public static void main(String[] args) {
        IntList list = new IntList();
        list.addToFront(20);
        list.addToFront(30);
        list.addToFront(40);
        list.addToRear(50);
        list.addToRear(60);
        list.addToRear(70);
        list.addToRear(80);
        list.printList();
        int a = list.removeFromFront();
        System.out.println(a);
        a = list.removeFromRear();
        System.out.println(a);
        list.printList();
        int sh = list.sum();
        System.out.println("Shuma ne kete moment eshte: "+sh);
    }
}
