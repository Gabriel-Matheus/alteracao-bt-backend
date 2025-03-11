package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
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

    @GetMapping()
    public List<Projeto> getProjeto() {
        return projetoService.findAll();
    }

    @GetMapping("/query")
    public List<Projeto> listarProjetoQuery() {
        return projetoRepository.listarProjetos();
    }
}