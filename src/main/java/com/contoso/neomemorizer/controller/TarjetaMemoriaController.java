package com.contoso.neomemorizer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contoso.neomemorizer.model.TarjetaMemoria;
import com.contoso.neomemorizer.service.TarjetaMemoriaService;

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
