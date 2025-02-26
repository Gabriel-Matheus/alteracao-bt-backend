package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.service.ProjetoService;
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
public class TelaRequisicaoController {

    @Autowired
    ProjetoService projetoService;

    @GetMapping("/requisition")
    public List<Projeto> getProjeto() {
        return projetoService.findAll();
    }
}