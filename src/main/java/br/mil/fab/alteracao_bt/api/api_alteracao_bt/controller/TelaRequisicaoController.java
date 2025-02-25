package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class TelaRequisicaoController {

    @Autowired
    ProjetoService projetoService;

    @GetMapping("/tela_requisicao")
    public String exibirTelaRequisicao(Model model) {
        model.addAttribute("projeto", new Projeto());
        return "tela_requisicao";
    }

    @PostMapping("/tela_requisicao")
    public String buscarProjeto(@RequestParam(value = "cdProjeto", required = false) String cdProjeto,
                                @RequestParam(value = "sgProjeto", required = false) String sgProjeto,
                                Model model) {
        // Realiza a busca pelo código do projeto
        if(cdProjeto != null) {
            Projeto projeto = projetoService.searchById(cdProjeto);
            if (projeto != null) {
                model.addAttribute("projeto", projeto);
            } else {
                model.addAttribute("erro", "Projeto não encontrado.");
            }
        }

        // Realiza a busca pela sigla do projeto
        if (sgProjeto != null) {
            Projeto projeto = projetoService.searchBySgProjeto(sgProjeto);
            if (projeto != null) {
                model.addAttribute("projeto", projeto);
            } else {
                model.addAttribute("erro", "Projeto não encontrado.");
            }
        }

        return "tela_requisicao";
    }
}