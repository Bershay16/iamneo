import java.util.*;
//normal single ll implemenattion, the rotae the even and odd numbers in sll
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val =val;
    }
}
class SLL{
    Node head = null;
    Node tail = null;
    SLL(){}
    SLL(int val){
        head = new Node(val);
        tail = head;
    }
    
    //Display
    void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> visited = new HashSet<>();
        SLL list = new SLL();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            //list.insertAt(sc.nextInt());
        }
        
    }
}