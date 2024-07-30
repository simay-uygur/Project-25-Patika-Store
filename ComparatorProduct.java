import java.util.Comparator;

/**
 * ComparatorProduct
 */
public class ComparatorProduct implements Comparator<Product>{

    public int compare(Product o1, Product o2) {
        return o1.getBrand().getBrandName().compareTo(o2.getBrand().getBrandName());
    }
    
}
