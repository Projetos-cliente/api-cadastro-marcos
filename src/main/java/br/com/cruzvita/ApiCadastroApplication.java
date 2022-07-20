package br.com.cruzvita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EntityScan(basePackages = "br.com.cruzvita.cadastro.model")
//@EnableConfigurationProperties
@EnableFeignClients
//@ComponentScan("br.com.cruzvita.cadastro")
@EnableJpaRepositories(basePackages = "br.com.cruzvita.cadastro.repository")
//@EnableAutoConfiguration
public class ApiCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCadastroApplication.class, args);
	}

}
