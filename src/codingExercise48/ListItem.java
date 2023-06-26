package codingExercise48;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    
    // Constructor
    public ListItem(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
   
  
           public abstract ListItem next();
    		 public abstract ListItem setNext(ListItem listItem);
    		 public abstract ListItem previous();
    		
    		 public abstract ListItem setPrevious(ListItem listItem);
    		 public abstract int compareTo(ListItem other) ;
    		
}
