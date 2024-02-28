package colmenatec.menuapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(MenuAppApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(MenuAppApplication.class, args);
		logger.info("Backend Funcionando");
	}

}
