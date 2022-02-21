package br.gov.ac.sefaz.gastos.dto;

import java.io.Serializable;
import java.util.Objects;

public class PessoaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;

    public PessoaDTO() {
    }

    public PessoaDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaDTO)) return false;
        PessoaDTO pessoaDTO = (PessoaDTO) o;
        return Objects.equals(getNome(), pessoaDTO.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
