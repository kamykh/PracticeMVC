package pl.edu.wszib;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.configuration.AppConfiguration;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.dao.impl.ProductDAOImpl;
import pl.edu.wszib.models.Product;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Product product = new Product("MiA2", "Xaomi", 100, 1);

        IProductDAO productDAO = context.getBean(IProductDAO.class);

        //productDAO.addProduct(product);

        productDAO.productSell(3);
        System.out.println(productDAO.showProduct());









    }
}
