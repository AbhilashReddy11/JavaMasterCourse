package codingExercise49;

import java.util.*;

public class Monster implements ISavable {
	
   private String name;
 
   private int hitPoints;
   private int strength;
public Monster(String name, int hitPoints, int strength) {
	super();
	this.name = name;
	this.hitPoints = hitPoints;
	this.strength = strength;

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getHitPoints() {
	return hitPoints;
}
public void setHitPoints(int hitPoints) {
	this.hitPoints = hitPoints;
}
public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
@Override
public List<String> write() {
	
	 List<String> values = new ArrayList<>();
     values.add(name);
     values.add(String.valueOf(hitPoints));
     values.add(String.valueOf(strength));
   
     return values;
}
@Override
public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
       
    }
}
@Override
public String toString() {
	return "Player {name=" + name + ",  hitPoints=" + hitPoints + ", strength=" + strength + "}";
}


  
}
