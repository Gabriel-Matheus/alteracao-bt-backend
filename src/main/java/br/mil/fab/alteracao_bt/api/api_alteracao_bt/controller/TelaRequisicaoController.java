package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Material;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Tarefa;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.MaterialRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.TarefaRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.service.ProjetoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class TelaRequisicaoController {

    @Autowired
    ProjetoService projetoService;

    @Autowired
    ProjetoRepository projetoRepository;

    @Autowired
    TarefaRepository tarefaRepository;

    @Autowired
    MaterialRepository materialRepository;

    @GetMapping()
    public List<Projeto> getProjeto() {
        return projetoService.findAll();
    }

    @GetMapping("/query")
    public List<Tarefa> listarTarefaQuery(){
        return tarefaRepository.findAll();
    }

    @GetMapping("/query2")
    public List<Material> findMateriaisByProjeto(){
        return materialRepository.findMateriaisByProjeto("4R");
    }

    /*
    @GetMapping("/")
    public List<Projeto> listarProjetoQuery() {
        return projetoRepository.listarProjetos();*/
    }




