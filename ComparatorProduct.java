import java.util.Comparator;

/**
 * ComparatorProduct
 */
public class ComparatorProduct implements Comparator<Product>{

    public int compare(Product o1, Product o2) {
        //there may be some issues if one is a cellphone ant the other one is a notebook
        return o1.getBrand().getBrandName().compareTo(o2.getBrand().getBrandName()) == 0 ? o1.getID()-o2.getID(): o1.getBrand().getBrandName().compareTo(o2.getBrand().getBrandName())  ;
    }
    
}
