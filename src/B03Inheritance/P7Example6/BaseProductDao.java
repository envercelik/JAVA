package B03Inheritance.P7Example6;

public class BaseProductDao {

    private String connectionString;


    public BaseProductDao(String connectionString) {
        this.connectionString = connectionString;
    }


    public void add (Product product) {
        System.out.println("Added to default database : " + product.getName());
    }



    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
