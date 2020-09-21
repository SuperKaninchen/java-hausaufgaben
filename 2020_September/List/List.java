public class List <ContentType> {

	private class ListNode {
		private ListNode next;
		private ListNode previous;
		private ContentType content;

		public ListNode(ContentType pContent) {
			next = null;
			previous = null;
			content = pContent;
		}
		public ContentType getContent() {
			return content;
		}
		public void setContent(ContentType pContent) {
			content = pContent;
		}
		public ListNode getNext() {
			return next;
		}
		public void setNext(ListNode pNext) {
			next = pNext;
		}
		public ListNode getPrevious() {
			return previous;
		}
		public void setPrevious(ListNode pPrevious) {
			previous = pPrevious;
		}
	}

	private ListNode first;
	private ListNode last;
	private ListNode current;

	public List() {
		first = null;
		last = null;
		current = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	public boolean hasAccess() {
		return (current != null);
	}
	public void next() {
		if(hasAccess()) {
			current = current.getNext();
		}
	}
	public void toFirst() {
		if(!isEmpty()) {
			current = first;
		}
	}
	public void toLast() {
		if(!isEmpty()) {
			current = last;
		}
	}
	public ContentType getContent() {
		return current.getContent();
	}
	public void setContent(ContentType pContent) {
		current.setContent(pContent);
	}
	public void append(ContentType pContent) {
		if(pContent == null)
			return;
		if(isEmpty()) {
			first = new ListNode(pContent);
			last = first;
		} else {
			last.setNext(new ListNode(pContent));
		}
	}
	public void insert(ContentType pContent) {
		if(pContent == null)
			return;
		ListNode tmp = new ListNode(pContent);
		if(hasAccess()) {
			current.getPrevious().setNext(tmp);
			current.setPrevious(tmp);
		} else if(!hasAccess() && isEmpty()) {
			first = tmp;
			last = tmp;
		}
	}
	public void concat(List<ContentType> pList) {
		if(pList == null || pList.isEmpty())
			return;
		pList.toFirst();
		last.setNext(new ListNode(pList.getContent()));
		last.getNext().setPrevious(last);
	}
	public void remove() {
		if(hasAccess()) {
			current.getPrevious().setNext(current.getNext());
			current = current.getNext();
		}
	}
	
}
