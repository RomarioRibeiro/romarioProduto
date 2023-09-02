package com.ribeiro.domain;

import java.io.Serializable;
import java.util.Date;

public class Patrimonio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descricao;
	private Date dataAquisicao;
	private Double valor;
	private String status;


}
