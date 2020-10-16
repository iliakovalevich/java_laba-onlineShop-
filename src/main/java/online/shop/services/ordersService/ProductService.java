package online.shop.services.ordersService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {
    final HashMap<Integer,String> productMap=new HashMap<>();

    public void addInMap(Integer id,String name){
        productMap.put(id, name);
    }

    public List getAllProducts(){
        return new ArrayList<>(productMap.values());
    }

    public String getProductById(int id){
        return productMap.get(id);
    }

}
