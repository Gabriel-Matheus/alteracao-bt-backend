package br.mil.fab.alteracao_bt.api.api_alteracao_bt.service;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Boletim;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.BoletimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletimService {

    @Autowired
    private BoletimRepository boletimRepository;

    public List<Boletim> findByCdMaterial(String cdMaterial) {
        return boletimRepository.findByCdMaterial(cdMaterial);
    }
}
