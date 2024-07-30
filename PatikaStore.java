
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * PatikaStore
 */

public class PatikaStore {

    public static TreeSet<Brand> brandList ;
    public static TreeSet<Product> productList;
    
    static{
        brandList= new TreeSet<>(new ComparatorBrand()) ;
        brandList.add(new Brand("Samsung"));
        brandList.add(new Brand("Lenovo"));
        brandList.add(new Brand("Apple"));
        brandList.add(new Brand("Huawei"));
        brandList.add(new Brand("Casper"));
        brandList.add(new Brand("Asus"));
        brandList.add(new Brand("HP"));
        brandList.add(new Brand("Xiaomi"));
        brandList.add(new Brand("Monster"));

        productList = new TreeSet<>(new ComparatorProduct());
        productList.add(new Notebook(11,1.2,33,"MACPRO",brandList.getFirst(),6, 14,1024));

    }

    //methods
    
    //add
    public static void removeProduct(TreeSet<Product> set, int id , String className ){
        Iterator<Product> iter = set.iterator();
        while(iter.hasNext()){
            Product remove = iter.next();
            if(id == remove.getID() && remove.getClass().getName() == className){
                set.remove(remove);
                return;
            }
        }

        System.out.println("Product with id " + id + " you entered could not found! ");
    }

    public static void addProduct( int unitPrice, double discount, int quantity, String name, Brand brand, int ram, double size, int storage ,CellPhone.Color color, int power, String className){
        switch(className){
            case "Notebook":
                Notebook n = new Notebook(unitPrice, discount, quantity,name,brand, ram, size, storage );
                productList.add(n);
            break;

            case "CellPhone":
                CellPhone c = new CellPhone(unitPrice, discount, quantity, className, brand, ram, size, storage, color, power);
                productList.add(c);
            break;

            default:
                System.out.println("Cannot add the product with given parameters. ");
            break;
        }
    }

    //search methods

    public Brand searchBrand(String name){
        Iterator<Brand> iterator = brandList.iterator();

        while(iterator.hasNext()){
            Brand curr = iterator.next();
            if(curr.getBrandName().equals(name)){
                return curr;   
            }

        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(brandList.toString());
        System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - CellPhone Processes %n3 - List Brands %n0 - Exit %nChoice : " );

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while(choice != 0){
            switch (choice){
                String className = "";
                case 1: //notebook processes 
                    className = "Notebook";
                    System.out.println("If you want to add a notebook enter A if you want to remove a notebook with its id number enter R: ");
                    String s = input.next();

                    if(s.equalsIgnoreCase("R")){
                        System.out.println("Please enter an id to remove: ");
                        int idRemove = input.nextInt();

                        removeProduct(productList, idRemove, className);
                        
                    } else if (s.equalsIgnoreCase("A")){
                        System.out.println("Please enter the features of the notebook with the same order according to this unitPrice, discount, quantity, name, brandname, ram, size,  storage , colorname, power: ");
                        int unit = input.nextInt();
                        double discount = input.nextDouble();
                        int quantity = input.nextInt();
                        String name = input.nextLine(); //it may not work
                        String brandname = input.nextLine();
                        Brand brand = searchBrand(brandname);
                        int ram = input.nextInt();
                        double size = input.nextDouble();
                        int storage = input.nextInt();
                        String color = input.next();
                        CellPhone.Color color;

                        if(color.equalsIgnoreCase("black")){
                            color = CellPhone.Color.BLACK;
                        } else if (color.equalsIgnoreCase("blue")){
                            color = CellPhone.Color.BLUE;
                        } else {
                            color = CellPhone.Color.RED;
                        }

                        int power = input.nextInt();
                        addProduct(unit, discount, quantity, brandname, brand, ram, size, storage, null, power, className);

                    } else { //not sure for this. 
                        System.out.print("Please enter R or A for process type. ");

                        System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - CellPhone Processes %n3 - List Brands %n0 - Exit %nChoice : " );

                        choice = input.nextInt();
                        continue;
                    }
                    
                break;
                case 2: //cellphone processes 
                    className = "CellPhone";
                    System.out.println("If you want to add a notebook enter A if you want to remove a cellphone with its id number enter R: ");

                    String sa = input.next();

                    if(sa.equalsIgnoreCase("R")){
                        System.out.println("Please enter an id to remove: ");
                        int removecellphone = input.nextInt();

                        removeProduct(productList, removecellphone, className);
                        
                    } else if (s.equalsIgnoreCase("A")){
                        System.out.println("Please enter the features of the notebook with the same order according to this unitPrice, discount, quantity, name, brandname, ram, size,  storage , colorname, power: ");
                        int unit = input.nextInt();
                        double discount = input.nextDouble();
                        int quantity = input.nextInt();
                        String name = input.nextLine(); 
                        String brandname = input.nextLine();
                        Brand brand = searchBrand(brandname);
                        int ram = input.nextInt();
                        double size = input.nextDouble();
                        int storage = input.nextInt();
                        String color = input.next();
                        CellPhone.Color color;
                        
                        if(color.equalsIgnoreCase("black")){
                            color = CellPhone.Color.BLACK;
                        } else if (color.equalsIgnoreCase("blue")){
                            color = CellPhone.Color.BLUE;
                        } else {
                            color = CellPhone.Color.RED;
                        }

                        int power = input.nextInt();
                      
                        Notebook addN = new CellPhone(unit, discount, quantity, name, brand, ram, size, storage, color, power);
                        productList.add(addN);
                        

                    } else { //not sure for this. 
                        System.out.print("Please enter R or A for process type. ");

                        System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - CellPhone Processes %n3 - List Brands %n0 - Exit %nChoice : " );

                        choice = input.nextInt();
                        continue;
                    }
                    
                break;

                case 3: //list brands
                break;
                    //list filter 
                default: //nothing 
                break;
            }

            System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - Cep Telefonu Processes %n3 - List Brands %n0 - Exit %nChoice : " );

            choice = input.nextInt();
                
        }

       System.out.println("Goodbye! ");

     
       
       System.out.println(productList.toString());

       try {
        PatikaStore.removeProduct(productList, 1001, "Notebook");
    } catch (Exception e) {
        
        e.printStackTrace();
    }
       System.out.println(brandList.toString());
       System.out.println(productList.toString());
    }

}