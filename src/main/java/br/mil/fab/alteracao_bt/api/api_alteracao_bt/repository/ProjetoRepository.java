package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Tarefa;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProjetoRepository extends JpaRepository<Projeto, String> {

    Optional<Projeto> findBySgProjeto(String sgProjeto);

    @Query(value = "SELECT * FROM t_projeto", nativeQuery = true)
    List<Projeto> listarProjetos();

}
