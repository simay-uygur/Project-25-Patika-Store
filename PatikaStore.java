
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PatikaStore
 */
public class PatikaStore {

    public static ArrayList<Brand> brandList ;

    static{
        brandList = new ArrayList<>();
        brandList.add(new Brand("Samsung"));
        brandList.add(new Brand("Lenovo"));
        brandList.add(new Brand("Apple"));
        brandList.add(new Brand("Huawei"));
        brandList.add(new Brand("Casper"));
        brandList.add(new Brand("Asus"));
        brandList.add(new Brand("HP"));
        brandList.add(new Brand("Xiaomi"));
        brandList.add(new Brand("Monster"));
    }

    public static void main(String[] args) {
        System.out.println(brandList.toString());
        System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - Cep Telefonu Processes %n3 - List Brands %n0 - Exit %nChoice : " );

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while(choice != 0){
            switch (choice){
                case 1: //notebook processes 

                break;
                case 2: //cellphone processes 
                break;

                case 3: //list brands
                break;

                default: //nothing 
                break;
            }

            System.out.printf("%nPatikaStore Product Management Panel !%n1 - Notebook Processes %n2 - Cep Telefonu Processes %n3 - List Brands %n0 - Exit %nChoice : " );

            choice = input.nextInt();
                
        }

       System.out.println("Goodbye! ");

    }
}