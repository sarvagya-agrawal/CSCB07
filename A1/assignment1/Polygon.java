package assignment1;
import java.util.*;


/**
 * @author sarvagya
 */

/**
 * The following abstract class Polygon defines general methods and properties that are shared by all polygons.
 * This class is further inherited by concrete classes such as Triangle, Quadrilateral, Pentagon as they define concrete polygon structures.
 */

public abstract class Polygon implements Transformable{
	/**
	 * This class has one field, namely an array called vertices. This array is made up of Point type data, i.e. the vertices
	 * array stores the Points (vertices) of a polygon. (These Points are Point objects)
	 */
	protected Point[] vertices;
	
	
	/**
	 * The constructor initializes the array points. It does so by taking as input @param ptSet which is a parameter
	 * of type Set. Specifically, A LinkedHashSet made up of points should be passed in as input to preserve order of points in the vertices array.
	 * Elements from @param ptSet are added to the array vertices.
	 * @throws IllegalArgumentException if we try to instantiate a particular kind of polygon with inappropriate number of points/vertices.
	 * For example, an IllegalArgumentException is thrown if we try to instantiate a Triangle with more or less than 3 Points/vertices.
	 */
	public Polygon(Set<Point> ptSet) {
		//Point[] vertices = new Point[ptSet.size()];
		
		//vertices = ptSet.toArray(vertices);		
		
		//System.out.println(vertices[0]);
		if (ptSet.size() != appropriateNumberOfVertices())
			throw new IllegalArgumentException("Cannot construct a polygon with an inappropriate number of vertices");
		
		this.vertices = ptSet.toArray(new Point[ptSet.size()]);
	}
	
	/**
	 * Abstract method which is implemented in concrete subclasses of the superclass Polygon
	 * @return the appropriate number of vertices for a particular polygon.
	 * For example, return 3 for triangles, 4 for quadrilaterals, etc.
	 */
	public abstract int appropriateNumberOfVertices();
	
	/**
	 * The following method computes the perimeter for any polygon at hand. It does so by taking the distance between each subsequent Point object in the vertices array
	 * and then taking the sum.
	 * The method keeps in mind the circular relationship between polygon vertices, i.e. for a triangle defined by vertices [a, b, c], the perimeter will be the same
	 * for another triangle defined by vertices [c, a, b].
	 * @return the perimeter for the desired polygon.
	 */
	public double computePerimeter() {
		System.out.println(vertices.length);
		double perimeter = 0;
		for (int i = 0; i < vertices.length; i++) {
			if (i == vertices.length - 1) {
				perimeter = perimeter + (vertices[i].distance(vertices[0]));
			} else {
				perimeter = perimeter + (vertices[i].distance(vertices[i+1]));
			}
		}
		return perimeter;
	}
	
	/**
	 * The following method checks if a particular Point exists in the Polygon. Specifically, it checks if a particular Point is an element of the vertices array defining the polygon.
	 * @param pt, A point type object. This is the point that we are checking if the polygon contains.
	 * @return a boolean value. Return true if @param pt exists in the polygon (i.e. the vertices array) and returns false otherwise.
	 */
	public boolean contains(Point pt) {
		for (int i = 0; i< vertices.length; i++) {
			if (vertices[i].equals(pt) == true) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * The following method translates all the points in the vertices array which define the polygon. Translation is done by adding the @params x2, y2, z2 
	 * the Point object's coordinates for each Point type object belonging to the vertices array. This leads to translation of each point in the array vertices
	 * defining the polygon.
	 */
	public void translate(double x2, double y2, double z2) {
		for (int i = 0; i < vertices.length; i++) {
			vertices[i].translate(x2, y2, z2);
		}

	}
	
	/**
	 * The following method scales all the points in the vertices array which define the polygon. Scaling of a point is done by multiplying the coordinates (x,y,z) of a Point 
	 * to a common factor. @param sfPol is the scaling factor which scales each point in the verices array.
	 * This leads to scaling of each point in the point in the array vertices defining the polygon.
	 */
	public void scale(double sfPol) {
		for (int i = 0; i < vertices.length; i++) {
			vertices[i].scale(sfPol);
		}
		
	}
	
	/**
	 * The following method checks if 2 Polygons are equal. 2 polygons are equal if they contain the same vertices (Points) in their vertices array in the same order. To elaborate, a 
	 * Polygon defined by vertices [a, b, c] is equal to another polygon defined by [c, a, b] as their vertices connect in the same manner which forms the same polygon.
	 * @param obj, this could be an object of any class; this is the object we compare our calling object against to check for equality.
	 * @return a boolean value. Returns true if both the calling object and input parameter object are equal and returns false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		
		// cast to general polygon type, not specific type. 
		
		Polygon pol1 = (Polygon)obj;
	
		for (Point pt: vertices) {
			if(pol1.contains(pt) != true) {
				return false;
			}
		}
		
		int marker = 0;
		
		for (int i = 0; i < pol1.vertices.length; i++) {
			if (pol1.vertices[i].equals(vertices[0]) == true) {
				marker = i;
			}	
		}
		
		Collections.rotate(Arrays.asList(pol1.vertices), pol1.vertices.length - marker);
		
		if (Arrays.equals(vertices, pol1.vertices) == true) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * The following method returns a unique hash code for each Polygon.
	 * The main idea here is that 2 equal Polygons should have the same hash code whereas 2 unequal polygons should have different hash codes.
	 */
	@Override
	public int hashCode() {
		int hcPol = 0;
		for (Point pt: vertices) {
			int i = pt.hashCode();
			hcPol = hcPol + i;
		}
		return hcPol;
	}
	
}


