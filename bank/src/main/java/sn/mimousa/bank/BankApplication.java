package sn.mimousa.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sn.mimousa.bank.entities.Titulaire;
import sn.mimousa.bank.repositories.CompteRepository;
import sn.mimousa.bank.repositories.TitulaireRepository;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class BankApplication implements CommandLineRunner{

	@Autowired
	private CompteRepository compteRepository;

	@Autowired
	private TitulaireRepository titulaireRepository;

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Titulaire t1 = new Titulaire("Macodou", "DIOUF", "mac.koonda@gmail.com", "77 123 01 01", "Liberte VI");
		Titulaire t2 = new Titulaire("Ousseynou", "TALL", "ousseynou@gmail.com", "77 123 02 02", "Toubab Dialaw");
		titulaireRepository.save(t1);
		titulaireRepository.save(t2);
	}
}

