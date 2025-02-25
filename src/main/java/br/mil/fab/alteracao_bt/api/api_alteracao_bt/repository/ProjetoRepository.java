package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface ProjetoRepository extends JpaRepository<Projeto, String>, JpaSpecificationExecutor<Projeto> {

    Optional<Projeto> findBySgProjeto(String sgProjeto);
}
