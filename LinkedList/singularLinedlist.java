

public class singularLinedlist {
    private Node head;
    private int size;

  public  class Node {
        String data;
        Node next;
        // Node head=null;

        // Constrator
        Node(String data) {
            this.data = data;
            this.next = null;

        }

    }

    public void addFrist(String data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head=newnode;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;

    }
    public void addposition(int p,String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        Node ptr=head;
        while(p!=0){
            ptr=ptr.next;
            p--;

        }
        ptr.next=newnode;
    }

    public void display(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("Null");
    }



    public static void main(String[] args) {

        // Create object of this class
        singularLinedlist obj = new singularLinedlist();
        obj.addFrist("h");
        obj.addFrist("a");
        obj.addlast("i");
        obj.addlast("m");
        //obj.addposition(0, "F");
        obj.display();


    }

}
