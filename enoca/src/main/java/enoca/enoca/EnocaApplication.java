package enoca.enoca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.text.SimpleDateFormat;
import java.util.Date;
@EnableJpaAuditing
@SpringBootApplication
public class EnocaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EnocaApplication.class, args);
	}

}
