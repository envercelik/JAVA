package B3Inheritance.P7Example6;

public class Main {

    public static void main(String[] args) {


        /*
        ProductManager productManager = new ProductManager(new BaseProductDao("base database conneciton string"));
        Product product = new Product("1","Dell laptop" ,4000);
        productManager.add(product);
        */

        /*
        ProductManager productManager = new ProductManager(new OracleProductDao("oracle database connection string"));
        Product product = new Product("2","Asus laptop" , 4200);
        productManager.add(product);
        */


        ProductManager productManager = new ProductManager(new MysqlProductDao("mysql database connection string"));
        Product product = new Product("3","Macbook pro",20000);
        productManager.add(product);










    }

}
