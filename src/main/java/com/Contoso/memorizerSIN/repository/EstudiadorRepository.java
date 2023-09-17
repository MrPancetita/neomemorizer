package com.contoso.memorizerSIN.repository;

import java.util.List;

import com.contoso.memorizerSIN.model.TarjetaMemoria;

public interface EstudiadorRepository {

    List<TarjetaMemoria> getTarjetasMemoria();
    
}
