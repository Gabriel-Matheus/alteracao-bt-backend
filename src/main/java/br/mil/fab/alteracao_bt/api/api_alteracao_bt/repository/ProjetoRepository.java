package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity.Projeto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

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
