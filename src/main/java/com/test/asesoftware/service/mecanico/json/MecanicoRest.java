package com.test.asesoftware.service.mecanico.json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MecanicoRest {
	@JsonProperty("llaveMecanico")
	DatosMecanicoRest datosMecanicoRest;	
	@JsonProperty("primerNombre")
	private String primerNombre;
	@JsonProperty("segundoNombre")
	private String segundoNombre;
	@JsonProperty("primerApellido")
	private String primerApellido;
	@JsonProperty("segundoApellido")
	private String segundoApellido;
	@JsonProperty("celular")
	private String numeroCelular;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("email")
	private String email;
	@JsonProperty("estado")
	private Integer estado;
}
