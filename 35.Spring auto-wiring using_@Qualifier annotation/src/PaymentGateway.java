import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class PaymentGateway {
 
    private Order order;
     
    public Order getOrder() {
        return order;
    }
 
    @Autowired
    @Qualifier("orderBean1")
    public void setOrder(Order order) {
        this.order = order;
    }
 
    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}