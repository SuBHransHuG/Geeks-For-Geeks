class Solution{
  Node delete(Node head, int k)
    {
	  // Your code here
	  if(k==1)return null;
      Node temp=head,prev=null;
      int c=1;
      while(temp!=null){
          if(c==k){
              c=0;
              prev.next=temp.next;
          }
          else prev=temp;
          c++;
          temp=temp.next;
      }
      return head;
    }
}
