public class IntList {
    IntListNode head;
    IntListNode tail;

    public IntList(){
        head = null;
        tail = null;
    }

    public void addToFront(int x){
        if(head == null){
            head = new IntListNode(x);
            tail = head;
        }else{
            IntListNode tmp = new IntListNode(x);
            tmp.next = head;
            head = tmp;
        }
    }

    public void addToRear(int x){
        if(head == null){
            head = new IntListNode(x);
            tail = head;
        }else {
            IntListNode tmp = new IntListNode(x);
            tail.next = tmp;
            tail = tmp;
        }
    }

    public int removeFromFront(){
        int rezultati;
        if(head == null){
            return -123456; //kod gabimi
        }else if(head == tail){
            rezultati = head.value;
            head = null;
            tail = null;
            return rezultati;
        }else{
            rezultati = head.value;
            head = head.next;
            return rezultati;
        }
    }

    public int removeFromRear(){
        int rezultati;
        if(head == null){
            return -123456;
        }else if(head == tail){
            rezultati = head.value;
            head = null;
            tail = null;
            return rezultati;
        }else{
            rezultati = tail.value;
            IntListNode tmp;
            for(tmp = head; tmp.next != tail; tmp=tmp.next){}
            tail = tmp;
            tmp.next = null;
            return rezultati;
        }
    }

    public void printList(){
        IntListNode tmp;
        for(tmp = head; tmp != null; tmp = tmp.next){
            System.out.print(tmp.value+" ");
        }
        System.out.println();
    }

    public int sum(){
        IntListNode tmp;
        int s = 0;
        for(tmp=head; tmp != null; tmp = tmp.next){
            s += tmp.value;
        }
        return s;
    }

}
