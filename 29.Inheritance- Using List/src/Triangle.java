import java.util.List; 
public class Triangle{ 
	private List<Points> points;

	public List<Points> getPoints() { 
		return points; 
	} 
	public void setPoints(List<Points> points) { 
		this.points = points; 
	}
	public String draw(){ 
		String string = "";
		for(Points point : points){
			string += "Point (" + point.getX() + "," + point.getY() + ")/n"; 
		}
		return string;	} 
}
