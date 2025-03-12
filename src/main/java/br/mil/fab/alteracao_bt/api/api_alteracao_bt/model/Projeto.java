package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

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

     /* colocar tamanho e propriedades (não foi possível devido a falta de acesso ao db) */
    @Column(name = "sg_projeto", length =  50, nullable = false)
    private String sgProjeto;

     /* colocar tamanho e propriedades (não foi possível devido a falta de acesso ao db) */
    @Column(name = "ds_projeto", length = 50, nullable = false)
    private String dsProjeto;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
    private List<Tarefa> tarefas;

}

    /*
    @OneToMany(mappedBy = "autor", fetch = FetchType.LAZY
//            , cascade = CascadeType.ALL
    )
    private List<Livro> livros;

    @CreatedDate
    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @LastModifiedDate
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}*/
