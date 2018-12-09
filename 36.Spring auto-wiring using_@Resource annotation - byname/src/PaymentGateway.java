import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class PaymentGateway {
 
    private Order orderBean26;
     
    public Order getOrder() {
        return orderBean26;
    }
 
    @Resource(name="orderBean1")
    public void setOrder(Order orderBean26) {
        this.orderBean26 = orderBean26;
    }
 
    @Override
    public String toString(){
        return "ordering "+this.orderBean26.getItem()+" | price: "+this.orderBean26.getPrice();
    }
}