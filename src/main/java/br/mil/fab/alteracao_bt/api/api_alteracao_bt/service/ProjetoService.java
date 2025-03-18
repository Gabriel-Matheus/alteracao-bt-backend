package br.mil.fab.alteracao_bt.api.api_alteracao_bt.service;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public List<Projeto> findAll(){
        return projetoRepository.findAll();
    }

    public List<Projeto> findBySgProjeto(String sgProjeto) {
        return projetoRepository.findBySgProjeto(sgProjeto);
    }

    public List<Projeto> findByCdProjeto(String cdProjeto){
    return projetoRepository.findByCdProjeto(cdProjeto);
    }

}
