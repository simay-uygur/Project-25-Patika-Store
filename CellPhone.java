public class CellPhone  extends Product{

    private int batteryPower;
    final Color color;

    CellPhone(int id, int unitPrice, double discount, int quantity, String name, Brand brand, int ram, double size, int storage, Color color, int power ) {
        super(id, unitPrice, discount, quantity, name, brand, ram, size, storage);
        this.color = color;
        this.batteryPower = power;
    }

    enum Color{
        BLACK,
        RED,
        BLUE    
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String toString() {
        return "CellPhone [batteryPower=" + batteryPower + ", color=" + color + ", getBatteryPower()="
                + getBatteryPower() + ", getColor()=" + getColor() + ", getID()=" + getID() + ", getUnitPrice()="
                + getUnitPrice() + ", getDiscountRate()=" + getDiscountRate() + ", getStockQuantity()="
                + getStockQuantity() + ", getProductName()=" + getProductName() + ", getBrand()=" + getBrand()
                + ", getRam()=" + getRam() + ", getScreenSize()=" + getScreenSize() + ", getId()=" + getId()
                + ", getStorage()=" + getStorage() + ", toString()=" + super.toString() + "]";
    }

    public Color getColor() {
        return color;
    }

}
