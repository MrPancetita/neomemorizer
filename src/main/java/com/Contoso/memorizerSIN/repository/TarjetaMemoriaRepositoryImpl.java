package com.contoso.memorizerSIN.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.contoso.memorizerSIN.model.TarjetaMemoria;

public class TarjetaMemoriaRepositoryImpl implements TarjetaMemoriaRepository{

    private JdbcTemplate jdbcTemplate; 

    public TarjetaMemoriaRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate; 
    }

    @Override
    public List<TarjetaMemoria> getTarjetasMemoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTarjetasMemoria'");
    }

    @Override
    public TarjetaMemoria createTarjetaMemoria() {
        throw new UnsupportedOperationException("Unimplemented method 'createTarjetaMemoria'");
    }


    
}
