package B03Inheritance.P7Example6;

public class ProductManager {
    //dependency injection
    BaseProductDao  productDao;

    public ProductManager(BaseProductDao productDao) {
        this.productDao = productDao;
    }


    public void add (Product product) {

        productDao.add(product);

    }

}
