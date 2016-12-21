import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by aharcsa on 2016. 05. 04..
 */

@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = "xy.z")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}