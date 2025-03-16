package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_material")
@Getter
@Setter
public class Material {

    @Id
    @Column(name = "cd_material", length = 2, nullable = false, insertable = false, updatable = false)
    private String cdMaterial;

    @Column(name = "nr_pn", length = 50, nullable = false)
    private String NrPn;

    @OneToMany(mappedBy = "material")
    @JsonIgnore
    private List<Boletim> boletim;

    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Tarefa> tarefa;
}
