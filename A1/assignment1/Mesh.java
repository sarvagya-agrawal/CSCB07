package assignment1;
import java.util.*;


public class Mesh implements Transformable {
	//create new data type to implement this
	private HashSet<acceptedPolygons> faceSet;
	
	public Mesh(Set<acceptedPolygons> polSet) {
		faceSet = new HashSet<acceptedPolygons>();
		for (acceptedPolygons p: polSet) {
			faceSet.add(p);
			
		}
	}
	
	public void translate(double xMesh, double yMesh, double zMesh) {
		for (acceptedPolygons faces: faceSet) {
			Polygon pol = (Polygon)faces;
			
			pol.translate(xMesh, yMesh, zMesh);
		}
	}
	
	public void scale(double sfMesh) {
		for (acceptedPolygons faces1: faceSet) {
			Polygon pol1 = (Polygon)faces1;
			
			pol1.scale(sfMesh);
			
		}
	}
	
	public void deleteVertex(Point delPt) {
		HashSet<acceptedPolygons> set = new HashSet<acceptedPolygons>();
		for (acceptedPolygons faces2: faceSet) {
			Polygon pol2 = (Polygon)faces2;
			
			if (pol2.contains(delPt) != true) {
				set.add(faces2);
			}
		}
		
		faceSet.clear();
		
		for (acceptedPolygons faces3: set) {
			faceSet.add(faces3);
		}
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		
		Mesh m = (Mesh)obj;
				
		
		if (m.faceSet.size() != faceSet.size())
			return false;
		
		
		
		int i = 0;
		for (acceptedPolygons face: faceSet) {
			Polygon f1 = (Polygon)face;
			for (acceptedPolygons face1: m.faceSet) {
				Polygon f2 = (Polygon)face1;
				if (f1.equals(f2) == true) {
					i++;
				}
			}
		}
		if (i == faceSet.size())
			return true;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hcMesh = 0;
		for (acceptedPolygons faceHc: faceSet) {
			Polygon h1 = (Polygon)faceHc;
			int i = h1.hashCode();
			hcMesh = hcMesh + i;
		}
		return hcMesh;
	}
	
	
	
}	
	
	
	
	
	