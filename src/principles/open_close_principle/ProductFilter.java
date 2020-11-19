package principles.open_close_principle;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {


    public Stream<Product> filterByColor(List<Product> productList, Color color){
        return productList.stream().filter(p->p.color == color);
    }


}
