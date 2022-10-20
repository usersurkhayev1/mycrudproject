package myfirstproject;

import myfirstproject.entity.Account;
import myfirstproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class mycrudproject implements CommandLineRunner {

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(mycrudproject.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Account account = new Account();

		account.setUserName("user1");
		account.setPassword("admin1234");
		account.setFirstName("Memmed");
		account.setLastName("Surkhayev");
		account.setEmail("MS@mail.ru");

		//accountRepository.save(account);
	}
}
