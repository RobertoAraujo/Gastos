package br.gov.ac.sefaz.gastos.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "pessoa")
public class PessoaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
