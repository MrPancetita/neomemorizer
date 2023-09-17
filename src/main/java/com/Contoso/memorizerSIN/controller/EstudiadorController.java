package com.contoso.memorizerSIN.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contoso.memorizerSIN.model.TarjetaMemoria;
import com.contoso.memorizerSIN.service.EstudiadorService;

@RestController
public class EstudiadorController {

    private EstudiadorService estudiadorService;

    public EstudiadorController(EstudiadorService estudiadorService) {
        this.estudiadorService = estudiadorService;
    }

    @PutMapping("/estudiador")
    public List<TarjetaMemoria> getTarjetasMemoria() {
        return estudiadorService.getTarjetasMemoria();
    }

    
    
}
