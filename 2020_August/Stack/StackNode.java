class StackNode <ContentType> {
  
  private ContentType content;
  private StackNode nextNode;
  
  StackNode(ContentType pContent, StackNode pNextNode) {
    content = pContent;
    nextNode = pNextNode;
  }
  
  public ContentType getContent() {
    return content;
  }
  public StackNode getNext() {
    return nextNode;
  }
  
}
