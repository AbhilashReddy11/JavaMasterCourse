package codingExercise33;

public class Point {
	private int X;
	private int Y;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public double distance() {
		return Math.sqrt((X*X)+(Y*Y));
	}
public double distance(int a,int b) {
		
		return Math.sqrt((X-a)*(X-a)+(Y-b)*(Y-b));
	}
public double  distance(Point p) {
int	a=p.getX();
int b=p.getY();
return distance(a,b);
	
}
	
	
public Point(int x, int y) {
	super();
	X = x;
	Y = y;
}
public Point() {
	X = 0;
	Y = 0;	
}


}
