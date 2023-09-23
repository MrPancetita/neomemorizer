package com.contoso.neomemorizer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.contoso.neomemorizer.model.TarjetaMemoria;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT) //remove to allow launching test with webserver running. 
class NeoMemorizerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void testGetTarjetasMemoria() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<TarjetaMemoria>> tarjetasMemoriaResponse = restTemplate.exchange(
                "http://localhost:8090/neomemorizer/estudiador", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<TarjetaMemoria>>() {
                });

		//Assert not null
        assertTrue(tarjetasMemoriaResponse.getBody() != null, "Body is null");

        List<TarjetaMemoria> tarjetasMemoria = tarjetasMemoriaResponse.getBody();

        for (TarjetaMemoria tarjetaMemoria : tarjetasMemoria) {
            System.out.println("Detalles de la tarjeta: " + tarjetaMemoria.getNumero() + " " + tarjetaMemoria.getPalabra()+ " " + tarjetaMemoria.getImagen());
        }

		
    }


}
