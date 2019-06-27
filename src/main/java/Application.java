import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableTransactionManagementØ
//@MapperScan("com.hx.hospital.**.dao.**")
//@EnableAsync
//@EnableAutoConfiguration
//@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = "com.yy.test.**")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

