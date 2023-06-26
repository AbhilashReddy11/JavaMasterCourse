package codingExercise34;

public class Floor {
private double width;
private double length;
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	if (width<0) {
		this.width = 0;	
	}else {
	this.width = width;
	}
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	if (length<0) {
		this.length = 0;	
	}else {
	this.length = length;
	}
}
public double area() {
	
	return length*width;
}
public Floor(double width, double length) {
	super();
	if (width<0) {
		this.width = 0;	
	}else {
	this.width = width;
	}
	if (length<0) {
		this.length = 0;	
	}else {
	this.length = length;
	}
}

}
