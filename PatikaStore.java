
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
    public static void removeProduct(TreeSet<Product> set, int id ) throws Exception{
        Iterator<Product> iter = set.iterator();
        while(iter.hasNext()){
            Product remove = iter.next();
            if(id == remove.getID()){
                set.remove(remove);
                return;
            }
        }

        throw new Exception("Product with id " + id + " you entered could not found! ");
    }

    


    public static void main(String[] args) {
        System.out.println(brandList.toString());
        System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - Cep Telefonu Processes %n3 - List Brands %n0 - Exit %nChoice : " );

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while(choice != 0){
            switch (choice){
                case 1: //notebook processes 

                    //add remove
                break;
                case 2: //cellphone processes 
                // add remove
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
        PatikaStore.removeProduct(productList, 1001);
    } catch (Exception e) {
        
        e.printStackTrace();
    }
       System.out.println(brandList.toString());
    }

}