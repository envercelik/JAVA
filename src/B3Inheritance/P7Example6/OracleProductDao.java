package B3Inheritance.P7Example6;

public class OracleProductDao extends BaseProductDao{

    public OracleProductDao(String connectionString) {
        super(connectionString);
    }


    @Override
    public void add(Product product) {
        System.out.println("Added to oracle database : " + product.getName());
    }
}
