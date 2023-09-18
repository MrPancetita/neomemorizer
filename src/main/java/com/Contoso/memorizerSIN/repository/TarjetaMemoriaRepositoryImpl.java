package com.contoso.memorizerSIN.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.repository.util.TarjetaMemoriaRowMapper;

@Repository
public class TarjetaMemoriaRepositoryImpl implements TarjetaMemoriaRepository{

    private JdbcTemplate jdbcTemplate; 

    public TarjetaMemoriaRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate; 
    }

    @Override
    public List<TarjetaMemoria> getTarjetasMemoria() {
        return jdbcTemplate.query("select * from tarjetamemoria", new TarjetaMemoriaRowMapper());
    }

    @Override
    public TarjetaMemoria createTarjetaMemoria() {
        throw new UnsupportedOperationException("Unimplemented method 'createTarjetaMemoria'");
    }


    
}
