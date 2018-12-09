import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor; 
public class Triangle implements InitializingBean, DisposableBean{ 
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
	@Override
	public void destroy() throws Exception {
		System.out.println("Initialization Bean destory method called for triangle");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("Initialization Bean init method called for triangle");
		
	}
	
}
