package br.gov.ac.sefaz.gastos.dto;

import br.gov.ac.sefaz.gastos.constants.Tag;
import br.gov.ac.sefaz.gastos.model.PessoaEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ContaDTO implements Serializable {
   private static final long serialVersionUID = 1L;

   private Long id;
   private String descricao;
   private LocalDate data;
   private double valor;
   private Tag tag;
   private Long pessoaId;
   private PessoaEntity pessoa;

   public ContaDTO() {
   }

   public ContaDTO(Long id, String descricao, LocalDate data, double valor, Tag tag, Long pessoaId, PessoaEntity pessoa) {
      this.id = id;
      this.descricao = descricao;
      this.data = data;
      this.valor = valor;
      this.tag = tag;
      this.pessoaId = pessoaId;
      this.pessoa = pessoa;
   }

   public Long getPessoaId() {
      return pessoaId;
   }

   public void setPessoaId(Long pessoaId) {
      this.pessoaId = pessoaId;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public LocalDate getData() {
      return data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   public double getValor() {
      return valor;
   }

   public void setValor(double valor) {
      this.valor = valor;
   }

   public Tag getTag() {
      return tag;
   }

   public void setTag(Tag tag) {
      this.tag = tag;
   }

   public PessoaEntity getPessoa() {
      return pessoa;
   }

   public void setPessoa(PessoaEntity pessoa) {
      this.pessoa = pessoa;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof ContaDTO)) return false;
      ContaDTO contaDTO = (ContaDTO) o;
      return Double.compare(contaDTO.getValor(), getValor()) == 0 && Objects.equals(getId(), contaDTO.getId()) && Objects.equals(getDescricao(), contaDTO.getDescricao()) && Objects.equals(getData(), contaDTO.getData()) && getTag() == contaDTO.getTag() && Objects.equals(getPessoa(), contaDTO.getPessoa());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getId(), getDescricao(), getData(), getValor(), getTag(), getPessoa());
   }

   @Override
   public String toString() {
      return "ContaDTO{" +
              "id=" + id +
              ", descricao='" + descricao + '\'' +
              ", data=" + data +
              ", valor=" + valor +
              ", tag=" + tag +
              ", pessoa=" + pessoa +
              '}';
   }
}
