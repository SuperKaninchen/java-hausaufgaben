class Stack <ContentType>{
  
  private StackNode<ContentType> head;
  
  Stack() {
    head = null;
  }
  
  public boolean isEmpty() {
    return head == null;
  }                                
  public void push(ContentType pContent) {
    head = new StackNode<ContentType>(pContent, head);
  }
  public void pop() {
    head = head.getNext();
  }
  public ContentType top() {
    return head.getContent();
  }
  
}
