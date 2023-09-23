package com.contoso.neomemorizer.repository;

import java.util.List;

import com.contoso.neomemorizer.model.TarjetaMemoria;

public interface TarjetaMemoriaRepository {

    List<TarjetaMemoria> findAll();
    TarjetaMemoria createTarjetaMemoria();
    
}
