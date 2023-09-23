package com.contoso.neomemorizer.service;
import com.contoso.neomemorizer.model.TarjetaMemoria;
import com.contoso.neomemorizer.repository.TarjetaMemoriaRepository;

import java.util.List;
import org.springframework.stereotype.Service;


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
