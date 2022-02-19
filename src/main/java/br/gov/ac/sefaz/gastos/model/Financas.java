package br.gov.ac.sefaz.gastos.model;

import br.gov.ac.sefaz.gastos.constants.Tag;

import java.io.Serializable;
import java.time.LocalDate;

public class Financas implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String descricao;
    private LocalDate data;
    private double valor;

    private Tag tag;

}
