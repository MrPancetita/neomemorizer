package com.contoso.memorizerSIN.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.repository.TarjetaMemoriaRepository;

@Service
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
