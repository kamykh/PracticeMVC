package pl.edu.wszib.dao;

import org.springframework.stereotype.Component;
import pl.edu.wszib.models.Product;

import java.util.List;


public interface IProductDAO {
    public void addProduct(Product product);
    public List<Product> showProduct();
    public Product showProductById(int product_id);
    public void productSell(int product_id);
}
