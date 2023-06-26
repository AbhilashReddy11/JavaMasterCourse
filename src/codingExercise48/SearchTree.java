package codingExercise48;

public class SearchTree implements NodeList {
	private ListItem root;
	

	public SearchTree(ListItem root) {
		super();
		this.root = root;
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
	 @Override
	 public boolean removeItem(ListItem item) {
	     if (item == null || root == null) {
	         return false;
	     }

	     ListItem currentItem = root;
	     ListItem parentItem = null;
	     while (currentItem != null) {
	         int comparison = currentItem.compareTo(item);
	         if (comparison == 0) {
	             // Found the item to remove
	             performRemoval(item, parentItem);
	             return true;
	         } else if (comparison > 0) {
	        	  // Move to the left child
	             parentItem = currentItem;
	             currentItem = currentItem.previous();
	         } else { // comparison < 0
	             // Move to the right child
	             parentItem = currentItem;
	             currentItem = currentItem.next();
	         }
	     }

	     return false;
	 }
	         
	   
	     
	     
	     
	     private void performRemoval(ListItem item, ListItem parent) {
	    	    if (parent == null) {
	    	        // Removing root node
	    	        root = null;
	    	    } else if (parent.compareTo(item) > 0) {
	    	        // Removing left child
	    	        parent.setPrevious(null);
	    	    } else {
	    	        // Removing right child
	    	        parent.setNext(null);
	    	    }
	     }
	     @Override
	     public void traverse(ListItem root) {
	         if (root != null) {
	             traverse(root.previous());
	             System.out.println(root.getValue());
	             traverse(root.next());
	         }
	     }

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

}
