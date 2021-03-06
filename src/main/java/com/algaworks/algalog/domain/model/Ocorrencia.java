package com.algaworks.algalog.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Ocorrencia {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Entrega entrega;
	
	
	private String descricao;
	
	private OffsetDateTime dataRegistro;
	
	
}
