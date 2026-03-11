
package co.unicauca.microkernel.plugins.argentina;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class ArgentinaDeliveryPlugin implements IDeliveryPlugin{

    public double calculateCost(Delivery delivery) {
        Product product = delivery.getProduct();
        double distance = delivery.getDistance();

        double cost;
        
        cost=Math.floor(distance/500)*3.5;
        
        return cost; 
    }
}
