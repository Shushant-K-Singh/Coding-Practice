public class ImlementationOfLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public class LinkedList{
        Node head;

        //Insert At End
        void InsertAtEnd(int data){
            Node val = new Node(data);
            if(head==null){
                head = val;
                return;
            }

            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = val;
        }

        //Insert at Beginning
        void InsertAtBeginning(int data){
            Node val = new Node(data);
            val.next = head;
            head = val;
        }

        // Delete a Node
        void delete(int key){

            Node temp = head;
            Node prev = null;
            
            // If head Node is the value to be deleted
            if(temp!=null && temp.data == key){
                head = temp.next;
                return;
            }

            // Searching for the key
            while(temp!=null && temp.data!=key){
                prev = temp;
                temp = temp.next;
            }

            // if value is Not present
            if(temp==null){
                return;
            }

            // if value is Present
            prev.next = temp.next;
        }

        // Display LinkedList
        void Display(){
            Node temp = head;
            while(temp.next!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
