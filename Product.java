public class Product {

    private int id;
    private int unitPrice;
    private double discountRate;
    private int stockQuantity;
    private String productName;
    private Brand brand;
    private int ram;
    private double screenSize;
    private int storage;

    Product(){}

    Product(int id, int unitPrice, double discount, int quantity, String name ,Brand brand , int ram, double size, int storage){
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discount;
        this.productName = name;
        this.stockQuantity = quantity;
        this.ram = ram;
        this.screenSize = size;
        this.brand = brand;
        this.storage = storage;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getUnitPrice(){
        return unitPrice;
    }
    
    public void setUnitPrice(int price){
        this.unitPrice = price;
    }

    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double rate){
        this.discountRate = rate;
    }

    public int getStockQuantity(){
        return stockQuantity;
    }

    public void setStockQuantity(int sQuantity){
        this.stockQuantity = sQuantity;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String name){
        this.productName = name;
    }

    public Brand getBrand(){
        return brand;
    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public int getRam(){
        return this.ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public double getScreenSize(){
        return this.screenSize;
    }

    public void setScreenSize(double size){
        this.screenSize = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String toString(){
        return "id: " + id +
                "unit price: " + unitPrice +
                "discount rate: " + discountRate +
                "stock quantity: " + stockQuantity +
                "product name: " + productName +
                "brand " + brand.toString() +
                "RAM " + ram +
                "screen size " + screenSize;
    }
}
