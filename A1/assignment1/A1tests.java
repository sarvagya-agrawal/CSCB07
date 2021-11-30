package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;



class A1tests {

	@Test
	void testPoint1() {
		Point pt1 = new Point(1, 1, 1);
		Point pt2 = new Point(2,2,2);
		
		pt1.translate(1, 1, 1);
		
		assertTrue(pt1.equals(pt2));

	}
	
	@Test
	void testTriangle1() {
		Point pt1 = new Point(1, 1, 1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.computePerimeter() == 4*Math.sqrt(3));
	}
	
	@Test
	void testTriangleDetermineType1() {
		Point pt1 = new Point(1, 1, 1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.determineType() == "Isosceles");
	}
	
	@Test
	void testTriangleDetermineType2() {
		Point pt1 = new Point(1, 1, 1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.determineType() == "Scalene");
	}
	
	@Test
	void testTriangleDetermineType3(){
		Point pt1 = new Point(2, 0, 0);
		Point pt2 = new Point(0 ,2, 0);
		Point pt3 = new Point(0,0,2);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.determineType() == "Equilateral");
	}
	
	@Test
	void testTriangleDetermineType4() {
		Point pt1 = new Point(1, 1, 1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(0,0,0);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.determineType() == "Isosceles");
	}
	
	@Test
	void testTriangleDetermineType5() {
		Point pt1 = new Point(4,4,4);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		Triangle t = new Triangle(set);
		
		assertTrue(t.determineType() == "Isosceles");
	}
	
	@Test
	void testTriangleScale() {
		Point pt1 = new Point(4,4,4);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		
		Point pt5 = new Point(8,8,8);
		Point pt6 = new Point(4,4,4);
		Point pt7 = new Point(6,6,6);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);
		
		
		Triangle t = new Triangle(set);
		Triangle t1 = new Triangle(set1);
		
		t.scale(2);
		
		assertTrue(t.equals(t1));
	}

	@Test
	void testTriangleTranslate() {
		Point pt1 = new Point(4,4,4);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		
		
		Point pt5 = new Point(5,6,7);
		Point pt6 = new Point(3,4,5);
		Point pt7 = new Point(4,5,6);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);
		
		
		Triangle t = new Triangle(set);
		Triangle t1 = new Triangle(set1);
		
		t.translate(1,2,3);
		
		assertTrue(t.equals(t1));
	}
	
	
	
	@Test
	void testQuadrilateral() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,3);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);
		set1.add(pt5);

		Quadrilateral quad = new Quadrilateral(set);
		Quadrilateral quad1 = new Quadrilateral(set1);
		
		assertTrue(quad.equals(quad1));
	}
	
	@Test
	void testQuadrilateralEquals1() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);
		set1.add(pt5);

		Quadrilateral quad = new Quadrilateral(set);
		Quadrilateral quad1 = new Quadrilateral(set1);
		
		assertTrue(quad.equals(quad1) == false);
		
	}
	

	@Test
	void testMeshEquals1() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		HashSet<acceptedPolygons> set3 = new HashSet<acceptedPolygons>();
		set3.add(tri);
		set3.add(quad);
		
		Mesh m1 = new Mesh(set3);
		

		assertTrue(m.equals(m1) == true);
		
	}
	
	@Test
	void testMeshDeleteVertex() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		

		Point pt8 = new Point(4,4,4);
		Point pt9 = new Point(2,2,2);
		Point pt10 = new Point(3,3,3);
		
		Point pt11 = new Point(5,5,5);
		
		LinkedHashSet<Point> set4 = new LinkedHashSet<Point>();
		
		set4.add(pt8);
		set4.add(pt9);
		set4.add(pt10);
		
		Triangle tri2 = new Triangle(set4);
		
		set2.add(tri2);
		
		Mesh m =  new Mesh(set2);
		
		HashSet<acceptedPolygons> set3 = new HashSet<acceptedPolygons>();
		set3.add(tri2);
		
		Mesh m1 = new Mesh(set3);
		
		m.deleteVertex(pt1);

		assertTrue(m.equals(m1) == true);
			
			
	}
	
	@Test
	void testMeshTranslate() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		
		
		Point pt9 = new Point(2,2,2);
		Point pt10 = new Point(3,3,3);
		Point pt11 = new Point(4,4,4);
		Point pt12 = new Point(5,5,5);
		
		LinkedHashSet<Point> set3 = new LinkedHashSet<Point>();
		
		set3.add(pt9);
		set3.add(pt10);
		set3.add(pt11);
		set3.add(pt12);
		
		Point pt13 = new Point(3,3,3);
		Point pt14 = new Point(4,4,6);
		Point pt15 = new Point(5,5,5);
		
		LinkedHashSet<Point> set4 = new LinkedHashSet<Point>();
		
		set4.add(pt13);
		set4.add(pt14);
		set4.add(pt15);
		
		Triangle tri1 = new Triangle(set4);
		Quadrilateral quad1 = new Quadrilateral(set3);
		
		HashSet<acceptedPolygons> set5 = new HashSet<acceptedPolygons>();
		set5.add(tri1);
		set5.add(quad1);
		
		Mesh m1 = new Mesh(set5);
		
		m.translate(1,1, 1);

		assertTrue(m.equals(m1) == true);
	}
	
	@Test
	void testMeshScale() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		
		
		Point pt9 = new Point(2,2,2);
		Point pt10 = new Point(4,4,4);
		Point pt11 = new Point(6,6,6);
		Point pt12 = new Point(8,8,8);
		
		LinkedHashSet<Point> set3 = new LinkedHashSet<Point>();
		
		set3.add(pt9);
		set3.add(pt10);
		set3.add(pt11);
		set3.add(pt12);
		
		Point pt13 = new Point(4,4,4);
		Point pt14 = new Point(6,6,10);
		Point pt15 = new Point(8,8,8);
		
		LinkedHashSet<Point> set4 = new LinkedHashSet<Point>();
		
		set4.add(pt13);
		set4.add(pt14);
		set4.add(pt15);
		
		Triangle tri1 = new Triangle(set4);
		Quadrilateral quad1 = new Quadrilateral(set3);
		
		HashSet<acceptedPolygons> set5 = new HashSet<acceptedPolygons>();
		set5.add(tri1);
		set5.add(quad1);
		
		Mesh m1 = new Mesh(set5);
		
		m.scale(2);

		assertTrue(m.equals(m1) == true);
	}
	
	@Test
	void testIllegalArgumentExceptionPolygon() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		try {
			Triangle tri = new Triangle(set);
		}
		catch(IllegalArgumentException ex) {
			assertEquals(ex.getLocalizedMessage(), "Cannot construct a polygon with an inappropriate number of vertices");
		}
	}
	
	@Test
	void testPolygonEquals() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Quadrilateral quad = new Quadrilateral(set);
		
		Object o = new Object();
		
		assertTrue(quad.equals(o) == false);
	}
	
	
	@Test
	void testPolygonEquals1() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		assertTrue(quad.equals(tri) == false);
	}
	
	@Test
	void testPolygonEquals2() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,3);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt5);
		set1.add(pt7);
		set1.add(pt8);
		
		
		
		Quadrilateral quad = new Quadrilateral(set);
		Quadrilateral quad1 = new Quadrilateral(set1);
				
		assertTrue(quad.equals(quad1) == false);
		
	}
	
	@Test
	void testMeshEquals2() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt6);
		set1.add(pt7);
		set1.add(pt8);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		assertTrue(m.equals(quad) == false);
	}
	
	@Test
	void testMeshEquals3() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		HashSet<acceptedPolygons> set3 = new HashSet<acceptedPolygons>();
		set3.add(quad);
		
		Mesh m1 = new Mesh(set3);
		

		assertTrue(m.equals(m1) == false);
	}

	@Test
	void testMeshEquals4() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		LinkedHashSet<Point> set4 = new LinkedHashSet<Point>();
		
		set4.add(pt8);
		set4.add(pt7);
		set4.add(pt6);
		
		Triangle tri2 = new Triangle(set4);
		
		HashSet<acceptedPolygons> set3 = new HashSet<acceptedPolygons>();
		set3.add(quad);
		set3.add(tri2);
		Mesh m1 = new Mesh(set3);
		

		assertTrue(m.equals(m1) == false);
	}
	
	@Test
	void testPointEquals() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,1,1);
		assertTrue(pt1.equals(pt2) == false);
	}
	
	@Test
	void testPointEquals1() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(1,2,2);
		assertTrue(pt1.equals(pt2) == false);
	}
	
	@Test
	void testPointEquals2() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Quadrilateral quad = new Quadrilateral(set);
		
		assertTrue(pt1.equals(quad) == false);
	}
	
	@Test
	void testMeshHashCode() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		Point pt8 = new Point(4,4,4);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		
		HashSet<acceptedPolygons> set3 = new HashSet<acceptedPolygons>();
		set3.add(quad);
		set3.add(tri);
		Mesh m1 = new Mesh(set3);
		

		assertTrue(m.hashCode() == m1.hashCode());
	}
	
	@Test
	void testPtEqualsNull() {
		Point pt = new Point(1,1,1);
		LinkedHashSet<Point> lhs = new LinkedHashSet<Point>();
		lhs.add(pt);
		Object i = null;
		
		assertTrue(pt.equals(i) == false);
		
	}
	
	@Test
	void testPolEqualsNull() {
		Point pt = new Point(1,1,1);
		Point pt1 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		
		LinkedHashSet<Point> lhs = new LinkedHashSet<Point>();
		
		lhs.add(pt);
		lhs.add(pt1);
		lhs.add(pt3);
		
		Triangle tri = new Triangle(lhs);
		
		Object o = null;
		
		assertTrue(tri.equals(o) == false);
		
	}
	
	@Test
	void testMeshEqualsNull() {
		Point pt1 = new Point(1,1,1);
		Point pt2 = new Point(2,2,2);
		Point pt3 = new Point(3,3,3);
		Point pt4 = new Point(4,4,4);
		
		LinkedHashSet<Point> set = new LinkedHashSet<Point>();
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt4);
		
		Point pt5 = new Point(1,1,1);
		Point pt6 = new Point(2,2,2);
		Point pt7 = new Point(3,3,5);
		
		LinkedHashSet<Point> set1 = new LinkedHashSet<Point>();
		
		set1.add(pt5);
		set1.add(pt6);
		set1.add(pt7);

		Quadrilateral quad = new Quadrilateral(set);
		Triangle tri = new Triangle(set1);
		
		HashSet<acceptedPolygons> set2 = new HashSet<acceptedPolygons>();
		
		set2.add(quad);
		set2.add(tri);
		
		Mesh m =  new Mesh(set2);
		
		Object o = null;
		
		assertTrue(m.equals(o) == false);
	}
}
