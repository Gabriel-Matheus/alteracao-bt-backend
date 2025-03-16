package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Boletim;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Material;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Projeto;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.BoletimRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.MaterialRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.ProjetoRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.TarefaRepository;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class AlteracaoBtController {

    @Autowired
    ProjetoService projetoService;

    @Autowired
    ProjetoRepository projetoRepository;

    @Autowired
    TarefaRepository tarefaRepository;

    @Autowired
    MaterialRepository materialRepository;

    @Autowired
    BoletimRepository boletimRepository;


    @GetMapping()
    public List<Projeto> getProjeto() {
        return projetoService.findAll();
    }

    @GetMapping("/buscar-materiais")
    public List<Material> getMateriaisByCdProjeto(@RequestParam("cdProjeto") String cdProjeto) {
        return materialRepository.findMateriaisByProjeto(cdProjeto);
    }

    @GetMapping("/buscar-projetos-por-cd")
    public List<Projeto> getProjetoByCdProjeto(@RequestParam("cdProjeto") String cdProjeto) {
        return projetoRepository.findProjetosByCdProjeto(cdProjeto);
    }

    @GetMapping("/buscar-projetos-por-sg")
    public List<Projeto> getProjetoBySgProjeto(@RequestParam("sgProjeto") String sgProjeto) {
        return projetoRepository.findProjetosBySgProjeto(sgProjeto);
    }

    @GetMapping("buscar-boletins")
    public List<Boletim> getBoletimByCdMaterial(@RequestParam("cdMaterial") String cdMaterial) {
        return boletimRepository.findBoletimByCdMaterial(cdMaterial);
    }



}


