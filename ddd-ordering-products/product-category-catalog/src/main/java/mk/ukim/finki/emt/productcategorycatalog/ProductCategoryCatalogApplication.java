package mk.ukim.finki.emt.productcategorycatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ProductCategoryCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCategoryCatalogApplication.class, args);
    }

}
