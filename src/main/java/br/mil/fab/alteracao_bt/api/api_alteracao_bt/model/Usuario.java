package br.mil.fab.alteracao_bt.api.api_alteracao_bt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

    @Column(name = "usuario")
    @Id
    private String usuario;

    @Column(name = "senha")
    private String senha;
}
