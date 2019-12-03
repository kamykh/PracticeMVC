package pl.edu.wszib.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.domain.Entity;
import org.springframework.stereotype.Component;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.models.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAOImpl implements IProductDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void addProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(product);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            System.out.println("Wywalilo transakcje");
        } finally {
            session.close();
        }
    }

    public List<Product> showProduct() {
        Session session = factory.openSession();
        List<Product> list = session.createCriteria(Product.class).list();
        session.close();
        return list;
    }


    public Product showProductById(int product_id) {
        Session session = factory.openSession();
        Product product = (Product) session.get(Product.class, product_id);
        return product;
    }

    public void productSell(int product_id){
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Product product = (Product)session.get(Product.class, product_id);
            product.lowerQuantity();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            System.out.println("Wywalilo transakcje");
        } finally {
            session.close();
        }

    }

}
