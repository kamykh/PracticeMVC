package pl.edu.wszib.configuration;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.dao.impl.ProductDAOImpl;
@EntityScan({"pl.edu.wszib.models"})
@Configuration
@ComponentScan({"pl.edu.wszib.dao.impl","pl.edu.wszib.models"})
public class AppConfiguration {

}
