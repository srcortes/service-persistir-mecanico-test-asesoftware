package com.test.asesoftware.service.mecanico.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.test.asesoftware.service.mecanico.json.MecanicoRest;
import com.test.asesoftware.service.mecanico.response.ManagerApiResponse;
@FeignClient(name="service-bd")
public interface MecanicoClienteRest {
	@PostMapping("/crearMecanico")
	public ManagerApiResponse<MecanicoRest> crearMecanico(MecanicoRest mecanico);
	@GetMapping(value="/obtenerMecanicos")
	public  ManagerApiResponse<List<MecanicoRest>> obtenerMecanicos();
}
