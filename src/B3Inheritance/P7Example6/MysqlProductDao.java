package B3Inheritance.P7Example6;

public class MysqlProductDao extends BaseProductDao{

    public MysqlProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Addet to Mysql database : " + product.getName());
    }
}
