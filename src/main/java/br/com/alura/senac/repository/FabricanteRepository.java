package br.com.alura.senac.repository;

import br.com.alura.senac.model.Fabricante;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FabricanteRepository extends CrudRepository<Fabricante, Integer>{

}
