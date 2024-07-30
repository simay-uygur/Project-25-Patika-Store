public class Notebook  extends Product{
    

    Notebook(){}

    Notebook(int id, int unitPrice, double discount, int quantity, String name, Brand brand, int ram, double size, int storage  ) {
        super(id, unitPrice, discount, quantity, name, brand, ram, size, storage);
        
    }

    @Override
    public String toString() {
        return "Notebook []";
    }


}
