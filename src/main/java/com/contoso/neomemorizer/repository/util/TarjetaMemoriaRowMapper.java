package com.contoso.neomemorizer.repository.util;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.contoso.neomemorizer.model.TarjetaMemoria;

public class TarjetaMemoriaRowMapper implements RowMapper<TarjetaMemoria>{

    @Override
    @Nullable
    public TarjetaMemoria mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
        TarjetaMemoria tarjetaMemoria = new TarjetaMemoria();
        tarjetaMemoria.setId(rs.getInt("id"));
        tarjetaMemoria.setNumero(rs.getInt("numero"));
        tarjetaMemoria.setPalabra(rs.getString("palabra"));
        tarjetaMemoria.setImagen(rs.getString("imagen"));
        return tarjetaMemoria;
    }
    
}
