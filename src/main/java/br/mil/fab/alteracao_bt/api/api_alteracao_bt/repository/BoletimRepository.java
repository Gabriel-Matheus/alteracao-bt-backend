package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity.Boletim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoletimRepository extends JpaRepository<Boletim, String> {

    @Query(value = "SELECT * FROM t_bt_boletim b " +
            "WHERE b.cd_material = :cdMaterial",
            nativeQuery = true)
    List<Boletim> findByCdMaterial(@Param("cdMaterial") String cdMaterial);

}
