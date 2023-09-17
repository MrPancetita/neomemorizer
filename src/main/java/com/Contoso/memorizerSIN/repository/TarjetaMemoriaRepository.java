package com.contoso.memorizerSIN.repository;

import java.util.List;

import com.contoso.memorizerSIN.model.TarjetaMemoria;

public interface TarjetaMemoriaRepository {

    List<TarjetaMemoria> getTarjetasMemoria();
    TarjetaMemoria createTarjetaMemoria();
    
}
