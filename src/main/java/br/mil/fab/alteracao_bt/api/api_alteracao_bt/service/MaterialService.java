package br.mil.fab.alteracao_bt.api.api_alteracao_bt.service;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.entity.Material;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> findByCdProjeto(String cdProjeto) {
        return materialRepository.findByCdProjeto(cdProjeto);
    }

}
