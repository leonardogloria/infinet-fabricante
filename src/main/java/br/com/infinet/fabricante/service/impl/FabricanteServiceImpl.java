package br.com.infinet.fabricante.service.impl;

import br.com.infinet.fabricante.model.Fabricante;
import br.com.infinet.fabricante.repository.FabricanteRepository;
import br.com.infinet.fabricante.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class FabricanteServiceImpl implements FabricanteService {
    private static final Logger LOGGER = Logger.getLogger(FabricanteServiceImpl.class.getName());
    @Autowired
    FabricanteRepository fabricanteRepository;
    @Override
    public void save(Fabricante fabricante) {
        fabricanteRepository.save(fabricante);
    }

    @Override
    public List<Fabricante> getAll() {
        return fabricanteRepository.findAll();
    }

    @Override
    public Optional<Fabricante> getById(String id) {
        return fabricanteRepository.findById(id);
    }

    @Override
    public Optional<Fabricante> findByNome(String nome) {
        LOGGER.info(String.format("PARAMETROS BUSCADOS NO SERVICO ----- %s ", nome));
        return  fabricanteRepository.findByNome(nome);
    }
}
