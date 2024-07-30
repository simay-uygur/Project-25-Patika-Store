import java.util.Comparator;

public class ComparatorBrand implements Comparator<Brand>{

    public int compare(Brand o1, Brand o2) {
        return o1.getBrandName().compareTo(o2.getBrandName());
    }
}

