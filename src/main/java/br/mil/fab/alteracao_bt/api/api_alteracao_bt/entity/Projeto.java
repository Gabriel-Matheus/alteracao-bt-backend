package br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "t_projeto")
@Getter
@Setter
@ToString
public class Projeto{

    @Id
    @Column(name = "cd_projeto", length = 2, nullable = false)
    private String cdProjeto;

    @Column(name = "sg_projeto", length =  50, nullable = false)
    private String sgProjeto;

    @Column(name = "ds_projeto", length = 50, nullable = false)
    private String dsProjeto;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Tarefa> tarefa;

}
