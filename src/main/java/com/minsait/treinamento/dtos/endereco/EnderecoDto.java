package com.minsait.treinamento.dtos.endereco;

import com.minsait.treinamento.dtos.conta.ContaDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDto {

	  private Long id;
	  private String cidade;
	  private String bairro;
	  private String rua;
	  private double numero;
	  private String cep;
	  private String referencia;
	  private Long idUsuario;
	
}
