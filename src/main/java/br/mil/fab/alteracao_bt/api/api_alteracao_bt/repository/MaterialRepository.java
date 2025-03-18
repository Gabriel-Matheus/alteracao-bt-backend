package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, String> {

    @Query(value = "SELECT DISTINCT m.* FROM t_material m " +
            "JOIN t_tarefa t ON m.cd_material = t.cd_material " +
            "JOIN t_projeto p ON t.cd_projeto = p.cd_projeto " +
            "WHERE p.cd_projeto = :cdProjeto",
            nativeQuery = true)
    List<Material> findByCdProjeto(@Param("cdProjeto") String cdProjeto);

}
