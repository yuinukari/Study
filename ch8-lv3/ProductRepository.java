public class ProductRepository {

    private Product[] products;
    private int count;

    public ProductRepository(int capacity) { ... }
    public void save(Product product) { ... }
    public Product findById(String productId) { ... }
}
