package com.contoso.memorizerSIN.service;
import java.util.List;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.repository.TarjetaMemoriaRepository;

public class EstudiadorServiceImpl implements EstudiadorService{

    private TarjetaMemoriaRepository estudiadorRepository;

    public TarjetaMemoriaRepository getEstudiadorRepository() {
        return estudiadorRepository;
    }

    public void setEstudiadorRepository(TarjetaMemoriaRepository estudiadorRepository) {
        this.estudiadorRepository = estudiadorRepository;
    }

    @Override
    public List<TarjetaMemoria> getTarjetasMemoria() {
        return this.estudiadorRepository.getTarjetasMemoria();
    }
    
}
