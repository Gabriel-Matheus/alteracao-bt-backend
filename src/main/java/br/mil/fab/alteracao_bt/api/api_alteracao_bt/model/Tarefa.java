package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

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

    @Column(name = "cd_projeto", length = 2, nullable = false)
    private String cdProjeto;

    @ManyToOne
    @JoinColumn(name = "cd_projeto", referencedColumnName = "id")
    private Projeto projeto;
}




