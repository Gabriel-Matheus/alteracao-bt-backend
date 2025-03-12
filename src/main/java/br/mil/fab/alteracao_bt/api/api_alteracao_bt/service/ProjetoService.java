package br.mil.fab.alteracao_bt.api.api_alteracao_bt.service;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Projeto searchById(String id){
        return projetoRepository.findById(id).orElse(null);
    }

    public List<Projeto> findAll(){
        return projetoRepository.findAll();
    }
}
