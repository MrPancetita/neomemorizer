package com.contoso.memorizerSIN.service;
import java.util.List;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.repository.EstudiadorRepository;

public class EstudiadorServiceImpl implements EstudiadorService{

    private EstudiadorRepository estudiadorRepository;

    public EstudiadorRepository getEstudiadorRepository() {
        return estudiadorRepository;
    }

    public void setEstudiadorRepository(EstudiadorRepository estudiadorRepository) {
        this.estudiadorRepository = estudiadorRepository;
    }

    @Override
    public List<TarjetaMemoria> getTarjetasMemoria() {
        return this.estudiadorRepository.getTarjetasMemoria();
    }
    
}
