package online.shop.services.ordersService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {
    HashMap<Integer,String> productMap=new HashMap<>();

    public void addInMap(Integer id,String name){
        productMap.put(id, name);
    }

    public List getAllProducts(){
        ArrayList<String> values=new ArrayList<>(productMap.values());
        return values;
    }

    public String getProductById(int id){
        return productMap.get(id);
    }
}
