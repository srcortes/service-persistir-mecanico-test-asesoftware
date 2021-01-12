package com.test.asesoftware.service.mecanico.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatosMecanicoRest {
	@JsonProperty("tipoId")
	private String tipoDocumento;
	@JsonProperty("id")
	private Long documento;
}
