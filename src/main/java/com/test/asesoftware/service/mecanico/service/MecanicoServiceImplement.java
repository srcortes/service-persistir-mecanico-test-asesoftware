package com.test.asesoftware.service.mecanico.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.test.asesoftware.service.mecanico.exception.InternalServerErrorException;
import com.test.asesoftware.service.mecanico.cliente.MecanicoClienteRest;
import com.test.asesoftware.service.mecanico.json.DatosMecanicoRest;
import com.test.asesoftware.service.mecanico.json.MecanicoRest;
import com.test.asesoftware.service.mecanico.response.ManagerApiResponse;
@Service
@Primary
public class MecanicoServiceImplement implements MecanicoService {	
	private static final long serialVersionUID = 3537051604727035048L;
	@Autowired
	MecanicoClienteRest mecanicoClienteRest;
	@Override
	public ManagerApiResponse<MecanicoRest> crearMecanico(MecanicoRest mecanico) throws InternalServerErrorException {
		try {				
			return mecanicoClienteRest.crearMecanico(mecanico);
		} catch (Exception ex) {
			throw new InternalServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);
		}
	}
	@Override
	public  ManagerApiResponse<List<MecanicoRest>> obtenerListaMecanicos() throws InternalServerErrorException {
		try {			 
			return mecanicoClienteRest.obtenerMecanicos();
		} catch (Exception ex) {
			throw new InternalServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);
		}
	}
}
