package br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_bt_boletim")
@Getter
@Setter
public class Boletim {

    @Id
    @Column(name = "id_boletim", length = 2, nullable = false)
    private String idBoletim;

    @Column(name = "nr_boletim", length = 2, nullable = false)
    private String nrBoletim;

    @Column(name = "cd_material", length =  50, nullable = false, insertable = false, updatable = false)
    private String cdMaterial;

    @Column(name = "dt_insert", length = 50, nullable = false)
    private String dtInsert;

    @Column(name = "nr_revisao", length = 3, nullable = false)
    private String nrRevisao;

    @Column(name = "dt_revisao", length = 30, nullable = false)
    private String dtRevisao;

    @ManyToOne
    @JoinColumn(name = "cd_material", referencedColumnName = "cd_material")
    @JsonIgnore
    private Material material;

}
