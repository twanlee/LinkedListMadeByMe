public class LinkedListMadeByMe<T>{
  private class Node<T>{
      T data;
      Node next;
      public Node(T data){
          this.data = data;
      }
  }
  Node<T> tail = null;
  Node<T> head = null;
  int size = 0;
  public LinkedListMadeByMe(){};
  public void addFirst(T data){
      if(head == null) head = new Node(data);
      else {
          Node temp = head;
          head = new Node(data);
          head.next = temp;
      }
      size++;
  }
  public void addLast(T data){
      if(head == null) head = new Node(data);
      else {
          Node temp = head;
          while (temp.next != null){
              temp = temp.next;
          }
          temp.next = new Node(data);
      }
      size++;
  }
  public void add(int index, T data){
      if(index == 0) addFirst(data);
      else if(index>=size) addLast(data);
      else {
          Node current = head;
          for (int i=1; i<index; i++){
              current = current.next;
          }
          Node temp = current.next;
          current.next = new Node(data);
          current.next.next = temp;
          size++;
      }
  }
  public void removeFirst(){
         Node temp = head;
         head = head.next;
      size--;
  }
  public void removeLast(){
      if(size == 1) head = null;
      else {
          Node current = head;
          for (int i=1; i<size-1; i++){
              current = current.next;
          }
          current.next = null;
          size--;
      }
  }
  public void remove(int index){
      if(index == 0) removeFirst();
      else if(index == size-1) removeLast();
      else {

          Node pre = head;
          for (int i=0; i<index-1; i++){
              pre = pre.next;
          }

          pre.next = pre.next.next;
      }
      size--;
  }
  public void show(){
      Node temp = head;
      while (temp != null){
          System.out.println(temp.data);
          temp = temp.next;

      }
  }
  public Boolean contains(T data){
      Node temp = head;
      for(int i = 0; i<size; i++){
          if(temp.equals(data)) return true;
          temp = temp.next;
      }
      return false;
  }

}
