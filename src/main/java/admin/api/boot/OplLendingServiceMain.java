package admin.api.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"admin.api,com.opl.commons.cors"})
@EnableAutoConfiguration
@SpringBootApplication
public class OplLendingServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(OplLendingServiceMain.class, args);
    }
}
