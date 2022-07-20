package br.com.cruzvita.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cruzvita.cadastro.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String>{

}
