package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EntityScan("application.*")
public class CniPfeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(CniPfeApplication.class, args);
	}

}
