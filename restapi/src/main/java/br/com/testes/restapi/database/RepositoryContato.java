package br.com.testes.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testes.restapi.entity.Contato;

public interface RepositoryContato extends JpaRepository<Contato, Long> {

}
