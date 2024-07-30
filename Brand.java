import java.util.Comparator;

public class Brand {
 
    private int id = 0;
    private String brandName;
    private static int brandNum = 0;

    Brand(){
        this.id =0;
        brandName = " ";
    }
 
    public Brand(String name ){
        this.brandName = name;
        Brand.brandNum++;
        id = brandNum;
    }

    public int getID(){
        return id;
    }
    
    public String getBrandName(){
        return this.brandName;
    }

    public String toString(){
        return "Brand id " + this.id + " brand " + brandName.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getBrandNum() {
        return brandNum;
    }

    public static void setBrandNum(int brandNum) {
        Brand.brandNum = brandNum;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    
   
}
