package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_tarefa")
@Getter
@Setter
public class Tarefa {

    @Id
    @Column(name = "cd_tarefa", length = 2, nullable = false)
    private String cdTarefa;

    @Column(name = "cd_projeto", length = 2, insertable = false, updatable = false)
    private String cdProjeto;

    @Column(name = "cd_material", length = 2, insertable = false, updatable = false)
    private String cdmaterial;

    @ManyToOne
    @JoinColumn(name = "cd_projeto", referencedColumnName = "cd_projeto")
    @JsonIgnore
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "cd_material", referencedColumnName = "cd_material")
    @JsonIgnore
    private Material material;
}




