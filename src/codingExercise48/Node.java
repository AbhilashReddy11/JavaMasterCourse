package codingExercise48;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
		
	}

	@Override
	public ListItem next() {
		return rightLink;
		
	}

	@Override
	public ListItem setNext(ListItem listItem) {
		rightLink=listItem;
		return rightLink;
	}

	@Override
	public ListItem previous() {
		return leftLink;
		
	}

	
	@Override
	public ListItem setPrevious(ListItem listItem) {
		leftLink=listItem;
		return leftLink;
		
	}
	@Override
    public int compareTo(ListItem other) {
        if (other != null) {
            return ((Comparable<Object>) this.value).compareTo(other.getValue());
        }
        return -1; 
    }

}
