package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Material;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Tarefa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProjetoRepository extends JpaRepository<Projeto, String> {

    @Query(value = "SELECT * FROM t_projeto p " +
            "WHERE p.cd_projeto = :cdProjeto",
            nativeQuery = true)
    List<Projeto> findByCdProjeto(@Param("cdProjeto") String cdProjeto);

    @Query(value = "SELECT * FROM t_projeto p " +
            "WHERE p.sg_projeto = :sgProjeto",
             nativeQuery = true)
    List<Projeto> findBySgProjeto(@Param("sgProjeto") String sgProjeto);


}
