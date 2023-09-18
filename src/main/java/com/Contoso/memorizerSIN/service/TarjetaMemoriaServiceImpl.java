package com.contoso.memorizerSIN.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.repository.TarjetaMemoriaRepository;

@Service
public class TarjetaMemoriaServiceImpl implements TarjetaMemoriaService{

    private TarjetaMemoriaRepository tarjetaMemoriaRepository;

    public TarjetaMemoriaServiceImpl (TarjetaMemoriaRepository tarjetaMemoriaRepository) {
        this.tarjetaMemoriaRepository = tarjetaMemoriaRepository;
    }

    public void setEstudiadorRepository(TarjetaMemoriaRepository tarjetaMemoriaRepository) {
        this.tarjetaMemoriaRepository = tarjetaMemoriaRepository;
    }

    @Override
    public List<TarjetaMemoria> findAll() {
        return this.tarjetaMemoriaRepository.findAll();
    }
    
}
