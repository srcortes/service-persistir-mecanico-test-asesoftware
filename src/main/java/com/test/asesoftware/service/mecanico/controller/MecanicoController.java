package com.test.asesoftware.service.mecanico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.asesoftware.service.mecanico.exception.InternalServerErrorException;
import com.test.asesoftware.service.mecanico.json.MecanicoRest;
import com.test.asesoftware.service.mecanico.response.ManagerApiResponse;
import com.test.asesoftware.service.mecanico.service.MecanicoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping(produces = "application/json")
@Validated
@CrossOrigin(origins = "*")
public class MecanicoController {
	@Autowired
	private MecanicoService mecanicoService;
	@ApiOperation(notes = "Service is responsable for creation mechanic", value = "N/A")
	@ApiResponses({ @ApiResponse(code = 200, message = "Ok", response = MecanicoRest.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = InternalServerErrorException.class) })
	@PostMapping(value="/crearMecanico")
    public ManagerApiResponse<MecanicoRest> crearMecanico(@RequestBody MecanicoRest mecanico) throws InternalServerErrorException {
		
		return mecanicoService.crearMecanico(mecanico);		
	}
	@ApiOperation(notes = "Service is responsable for generate list mechanics from DB", value = "N/A")
	@ApiResponses({ @ApiResponse(code = 200, message = "Ok", response = MecanicoRest.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = InternalServerErrorException.class) })
	@GetMapping(value = "/obtenerMecanicos")
	public ManagerApiResponse<List<MecanicoRest>> obtenerMecanicos() throws InternalServerErrorException {

		return mecanicoService.obtenerListaMecanicos();
	}
}

