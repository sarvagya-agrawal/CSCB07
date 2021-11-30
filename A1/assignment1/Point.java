package assignment1;

public class Point implements Transformable{
	private double x;
	private double y;
	private double z;
	
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public void translate(double x1, double y1, double z1) {
		this.x = x + x1;
		this.y = y + y1;
		this.z = z + z1;

	}
	
	
	public void scale(double sf) {
		this.x = x * sf;
		this.y = y * sf;
		this.z = z * sf;
		
	}

	
	public double distance(Point other) {
		return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2) + Math.pow(z - other.z, 2));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj.getClass() != getClass())
			return false;
		//at this point, we know x is not null and x is an instance of class Point
		
		//casting object x as point
		Point p = (Point)obj;
		
		if(x != p.x || y != p.y || z != p.z)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		double d = this.x + this.y + this.z;
		int hc = (int)d;
		return hc;
	}
	
	
	
}
	
	
