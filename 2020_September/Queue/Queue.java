public class Queue <ContentType> {
  
  private class QueueNode {
    private QueueNode next;
    private ContentType content;
    
    public QueueNode(ContentType pContent) {
      next = null;
      content = pContent;
    }
    public ContentType getContent() {
      return content;
    }
    public QueueNode getNext() {
      return next;
    }
    public void setNext(QueueNode pNext) {
      next = pNext;
    }
  }
  
  private QueueNode first;
                                                             
  public Queue() {
    first = null;
  }
  public ContentType front() {
    if(isEmpty())
      return null;
    return first.getContent();
  }
  public boolean isEmpty() {
    return (first == null);
  }
  public void enqueue(ContentType pContent) {
    QueueNode curNode = first;
    if(!isEmpty()) {
      while (curNode.getNext() != null) { 
        curNode = curNode.getNext();
      }
      curNode.setNext(new QueueNode(pContent));
    } else {
      first = new QueueNode(pContent);
    } // end of if-else
    
  }
  public ContentType dequeue() {
    if(isEmpty()) 
      return null;
    QueueNode curNode = first;
    first = curNode.getNext();
    return curNode.getContent();
  }
}
