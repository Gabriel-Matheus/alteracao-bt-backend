package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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
