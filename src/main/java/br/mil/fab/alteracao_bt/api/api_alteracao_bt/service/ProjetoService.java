package br.mil.fab.alteracao_bt.api.api_alteracao_bt.service;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.specification.ProjetoSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import static br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.specification.ProjetoSpecs.*;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public Projeto searchBySgProjeto(String sgProjeto){
        Optional<Projeto> projeto = projetoRepository.findBySgProjeto(sgProjeto);
        return projeto.orElse(null);
    }


    public List<Projeto> searchByCdProjetoSpecs(String cdProjeto){

        Specification<Projeto> specs = Specification.where((root, query, cb) -> cb.conjunction() );

        if(cdProjeto != null) {
            specs = specs.and(cdProjetoEqual(cdProjeto));
        } else{
            //tratar erro
        }

        return projetoRepository.findAll(specs);
    }


    public List<Projeto> searchBySgProjetoSpecs(String sgProjeto) {
        Specification<Projeto> specs = Specification.where((root, query, cb) -> cb.conjunction() );

        if (sgProjeto != null && !sgProjeto.isEmpty()) {
            specs = specs.and(ProjetoSpecs.sgProjetoEqual(sgProjeto));
        }

        return projetoRepository.findAll(specs);
    }

    public Projeto searchById(String id){
        return projetoRepository.findById(id).orElse(null);
    }

}
