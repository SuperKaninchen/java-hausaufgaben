class Stack <ContentType>{
  
  private StackNode<ContentType> curNode;
  
  Stack() {
    curNode = null;
  }
  
  public boolean isEmpty() {
    return curNode == null;
  }                                
  public void push(ContentType pContent) {
    curNode = new StackNode<ContentType>(pContent, curNode);
  }
  public void pop() {
    curNode = curNode.getNext();
  }
  public ContentType top() {
    return curNode.getContent();
  }
  
}
