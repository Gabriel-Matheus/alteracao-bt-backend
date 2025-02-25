package br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.specification;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import org.springframework.data.jpa.domain.Specification;

public class ProjetoSpecs {

    public static Specification<Projeto> cdProjetoEqual(String cdProjeto){
        return (root, query, cb) -> cb.equal(cb.upper(root.get("cdProjeto")), cdProjeto.toUpperCase());
    }

    public static Specification<Projeto> sgProjetoEqual(String sgProjeto){
        return (root, query, cb) -> cb.equal(cb.upper(root.get("sgProjeto")), sgProjeto.toUpperCase());
    }

    public static Specification<Projeto> dsProjetoEqual(String dsProjeto){
        return (root, query, cb) -> cb.equal(root.get("dsProjeto"), dsProjeto);
    }

}
