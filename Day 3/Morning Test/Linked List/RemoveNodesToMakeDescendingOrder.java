//import java.util.*;

class Node{
    int value;
    Node next;
    Node(){}
    Node(int value){
        this.value = value;
    }
}
class SLL{
    Node head;
    SLL(){}
    SLL(int value){
        head = new Node(value);
    }
    void insert(int value){
        //No elements
        if(head==null){
            head=new Node(value);
            return;
        }
        //one or more element
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(value);
    }
    void reverse(int k){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(k>count) return;
        int limit = count/k,i=0;
        boolean shouldReverse = true;
        while(i<limit){
            temp = head;
            if(!shouldReverse){
                i++;
                for(int j=0;j<k;j++){
                    temp=temp.next;
                }
                shouldReverse = !shouldReverse;
            }else{
                //int[] arr = new int[k];
            }

        }

    }
    void display(){
        System.out.println();
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }
}
public class RemoveNodesToMakeDescendingOrder {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        SLL list = new SLL();
        for(int num:nums){
            list.insert(num);
        }
        list.reverse(3);
        list.display();
    }
}
