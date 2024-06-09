public class Point2D{
	//tight encapsulation
	private int x;
	private int y;
	
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String show(){
		return "X-coordinate is "+this.x+", Y-coordinate is "+this.y;
	}
	
	public boolean isEqual(Point2D p){
		return this.x == p.x && this.y == p.y;
	}
	public double calculateDistance(Point2D p){
		return Math.sqrt(
		Math.pow((this.x-p.x),2)
		+Math.pow((this.y-p.y),2)
		);
	}
}
	