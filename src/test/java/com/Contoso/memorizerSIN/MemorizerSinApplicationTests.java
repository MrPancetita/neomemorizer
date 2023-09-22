package com.Contoso.memorizerSIN;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.contoso.memorizerSIN.model.TarjetaMemoria;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT) //remove to allow launching test with webserver running. 
class MemorizerSinApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void testGetTarjetasMemoria() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<TarjetaMemoria>> tarjetasMemoriaResponse = restTemplate.exchange(
                "http://localhost:8080/memorizersin/estudiador", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<TarjetaMemoria>>() {
                });

		//Assert not null
        assertTrue(tarjetasMemoriaResponse.getBody() != null, "Body is null");

        List<TarjetaMemoria> tarjetasMemoria = tarjetasMemoriaResponse.getBody();

        for (TarjetaMemoria tarjetaMemoria : tarjetasMemoria) {
            System.out.println("Speaker name: " + tarjetaMemoria.getNumero() + " " + tarjetaMemoria.getPalabra()+ " " + tarjetaMemoria.getImagen());
        }

		
    }


}
