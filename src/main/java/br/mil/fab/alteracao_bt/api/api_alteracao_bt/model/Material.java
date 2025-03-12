package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

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
    @Column(name = "cd_material", length = 2, nullable = false)
    private String cdMaterial;

     /* colocar tamanho e propriedades (não foi possível devido a falta de acesso ao db) */
    @Column(name = "nr_pn", length = 50, nullable = false)
    private String NrPn;

    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
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
