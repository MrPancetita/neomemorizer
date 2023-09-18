package com.contoso.memorizerSIN.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.service.TarjetaMemoriaService;

@RestController
public class TarjetaMemoriaController {

    private TarjetaMemoriaService tarjetaMemoriaService;

    public TarjetaMemoriaController(TarjetaMemoriaService tarjetaMemoriaService) {
        this.tarjetaMemoriaService = tarjetaMemoriaService;
    }

    @GetMapping("/estudiador")

    public List<TarjetaMemoria> getTarjetasMemoria() {
        return tarjetaMemoriaService.findAll();
    }

    
    
}
