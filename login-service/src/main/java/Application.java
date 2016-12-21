import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Login service
 * Created by aharcsa on 2016. 05. 04..
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.mobilefirstsolutions.microservices.service.login.entity")
@ComponentScan(basePackages = Application.BASE_PACKAGE)
public class Application {
    public static final String BASE_PACKAGE = "com.mobilefirstsolutions.microservices.service.login";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
