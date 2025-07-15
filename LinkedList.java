class Main {
    public static void main(String [] args){
        //Scanner sc=new Scanner(System.in);
        llk list =new llk();
        list=list.insert(list,1);
        list=list.insert(list,2);
        list=list.insert(list,3);
        //list=list.delfirst(list);
        //list.print(list);
        //System.out.println();
        list=list.random_insert(list,4,3);
        // list.print(list);
        // System.out.println();
        list=list.random_insert(list,5,4);
        list=list.reverse(list);
        list.print(list);
    }
}
class llk{
Node head;
    static class Node{
        int data;
        Node next;
        Node(int key){
            this.data=key;
            next=null;
        }  
    }
    public static llk insert(llk head,int key){
        Node node = new Node(key);
        if(head.head==null){
            head.head=node;
        }
        else{
            Node temp= head.head;
                while(temp.next!=null){
                    temp=temp.next;
                }
            temp.next=node;
        }
    return head;
    }
    public static llk delfirst(llk head){
        Node temp= head.head;
        head.head=temp.next;
        temp.next=null;
        return head;
    }
    public static llk random_insert(llk head,int key,int pos){
        Node temp =head.head;
        Node node=new Node(key);
        if(pos==0){
            node.next=head.head;
            head.head=node;
        }
        for(int i=0;i<pos-1;i++){ //this can also be writen -->for(int i=1;i<pos;i++){
            if(temp.next==null){
                break;//
            }
            temp=temp.next;
        }
            node.next=temp.next;
            temp.next=node;
        return head;
    }
    public static llk reverse(llk head){
        Node temp=head.head;
        
        if(temp.next.next!=null){
            Node prev = head.head;
            Node curr = prev.next;
            Node next = curr.next;
            prev.next=null;
            while(next!=null){
                curr.next=prev;
                prev=curr;
                curr=next;
                next=next.next;
                // head.head=curr;
            // if(next.next==null){
            //     next.next=prev;
            //     head.head=next;
            // } 
            }
            curr.next=prev;
            head.head=curr;
        }
        return head;
    }
    public static void print(llk head){
    Node temp=head.head;
        if(head.head==null) System.out.println("null");
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}
