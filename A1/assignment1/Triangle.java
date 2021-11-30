package assignment1;
import java.util.*;

public class Triangle extends Polygon implements acceptedPolygons{
	
	public Triangle(Set<Point> triPt){
		super(triPt);
	}
	
	public int appropriateNumberOfVertices() {
		return 3;
		
	}
	
	public String determineType() {
		if (vertices[0].distance(vertices[1]) == vertices[1].distance(vertices[2]) && vertices[0].distance(vertices[1]) == vertices[2].distance(vertices[0])) {
			return "Equilateral";
		} else if (vertices[0].distance(vertices[1]) == vertices[1].distance(vertices[2]) && vertices[0].distance(vertices[1]) != vertices[2].distance(vertices[0])) {
			return "Isosceles";
		} else if (vertices[0].distance(vertices[1]) != vertices[1].distance(vertices[2]) && vertices[0].distance(vertices[1]) == vertices[2].distance(vertices[0])) {
			return "Isosceles";
		} else if (vertices[1].distance(vertices[2]) == vertices[2].distance(vertices[0]) && vertices[1].distance(vertices[2]) != vertices[0].distance(vertices[1])) {
			return "Isosceles";
		}
		return "Scalene";
	}

	
	
}
