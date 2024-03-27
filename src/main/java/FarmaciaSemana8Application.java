package br.com.alura.FarmaciaSemana8;

import br.com.alura.senac.principal.Principal;
import br.com.alura.senac.repository.ProdutoRepository;
import br.com.alura.senac.repository.FabricanteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaSemana8Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaSemana8Application.class, args);

	@Override
	public void run(String...for (String arg : args) {
			
		}
	) throws Exception {
			FabricanteRepository FabricanteRepository;
			Principal principal = new Principal(ProdutoRepository, FabricanteRepository);
		principal.exibeMenu();

		}
	}
}
