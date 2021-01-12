package com.test.asesoftware.service.mecanico.service;

import java.util.List;

import com.test.asesoftware.service.mecanico.exception.InternalServerErrorException;
import com.test.asesoftware.service.mecanico.json.MecanicoRest;
import com.test.asesoftware.service.mecanico.response.ManagerApiResponse;

public interface MecanicoService {
	ManagerApiResponse<MecanicoRest> crearMecanico(MecanicoRest mecanico) throws InternalServerErrorException;
	ManagerApiResponse<List<MecanicoRest>> obtenerListaMecanicos() throws InternalServerErrorException;
}
