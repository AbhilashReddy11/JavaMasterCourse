package codingExercise48;



public class MyLikedList implements NodeList  {
	private ListItem root;

	public MyLikedList(ListItem root) {
		super();
		this.root = root;
	}
	public ListItem getRoot() {
		return root;
	}
	 public boolean addItem(ListItem newItem) {
	        if (root == null) {
	            root = newItem;
	            return true;
	        }

	        ListItem currentItem = root;
	        while (currentItem != null) {
	            int comparison = currentItem.compareTo(newItem);
	            if (comparison == 0) {
	                // Item already exists, cannot add
	                return false;
	            } else if (comparison < 0) {
	            	 if (currentItem.next() != null) {
	                     currentItem = currentItem.next();
	                 } else {
	                     currentItem.setNext(newItem);
	                     return true;
	                 }
	             } else {
	                 if (currentItem.previous() != null) {
	                     currentItem = currentItem.previous();
	                 } else {
	                     currentItem.setPrevious(newItem);
	                     return true;
	                 }
	             }
	         }

	         return false;
	     }

	     public boolean removeItem(ListItem item) {
	         if (item == null) {
	             return false;
	         }

	         ListItem currentItem = root;
	         while (currentItem != null) {
	             int comparison = currentItem.compareTo(item);
	             if (comparison == 0) {
	                 if (currentItem == root) {
	                     root = null;
	                 } else {
	                     if (currentItem.previous() != null) {
	                         currentItem.previous().setNext(currentItem.next());
	                     }
	                     if (currentItem.next() != null) {
	                         currentItem.next().setPrevious(currentItem.previous());
	                     }
	                 }
	                 return true;
	             } else if (comparison < 0) {
	                 currentItem = currentItem.next();
	             } else {
	                 currentItem = currentItem.previous();
	             }
	         }

	         return false;
	     }

	     public void traverse(ListItem root) {
	         if (root == null) {
	             System.out.println("The list is empty");
	         } else {
	             while (root != null) {
	                 System.out.println(root.getValue());
	                 root = root.next();
	             }
	         }
	     }
	 
	






	 






	            
	

}
