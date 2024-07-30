import java.util.Comparator;

public class ComparatorBrand implements Comparator<Brand>{

    public int compare(Brand o1, Brand o2) {
        return o1.getBrandName().compareTo(o2.getBrandName()) == 0 ? o1.getID()-o2.getID() : o1.getBrandName().compareTo(o2.getBrandName());
    }
}

