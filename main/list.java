/**
 * list
 */
public class list 
{

    Node head;


    //ADDING VALUE TO THE START OF THE LIST 
    void addfirst(String data) {
        Node obj = new Node(data);
        if (head == null) {
            head = obj;
            return;
        }
        obj.next = head;
        head = obj;
    }


    // ADDING VALUE TO THE END OF THE LIST

    void addLast(String data) {
        Node obj = new Node(data);
        if (head == null) {
            head = obj;
            return;
        }

        Node cNode = head;
        while (cNode.next != null) {
            cNode = cNode.next;
        }
        cNode.next = obj;
    }

    
    // DISPLAYING THE LIST;

    void show() {
        Node cNode = head;
        while (cNode != null) {
            System.out.print(cNode.data + "-->");
            cNode = cNode.next;
        }
        System.out.println("NULL");
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next = null;        
        }
    }
public static void main(String[] args) {
    list obj = new list();
    for(int i =0;i<10;i++){
        obj.addLast(Integer.toString(i));
    }
    obj.show();
}

}