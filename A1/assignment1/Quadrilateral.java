package assignment1;
import java.util.*;

public class Quadrilateral extends Polygon implements acceptedPolygons{
	
	public Quadrilateral(Set<Point> quadPoints) {
		super(quadPoints);
	}
	
	public int appropriateNumberOfVertices() {
		return 4;
	}
	
	

}
