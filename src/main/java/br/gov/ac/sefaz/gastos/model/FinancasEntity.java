package br.gov.ac.sefaz.gastos.model;

import br.gov.ac.sefaz.gastos.constants.Tag;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "financas")
public class FinancasEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descricao;
    @Column
    private LocalDate data;
    @Column
    private double valor;

    @Enumerated(EnumType.STRING)
    private Tag tag;

    public FinancasEntity() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinancasEntity)) return false;
        FinancasEntity that = (FinancasEntity) o;
        return Double.compare(that.getValor(), getValor()) == 0 && Objects.equals(getId(), that.getId()) && Objects.equals(getDescricao(), that.getDescricao()) && Objects.equals(getData(), that.getData()) && getTag() == that.getTag();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescricao(), getData(), getValor(), getTag());
    }

    @Override
    public String toString() {
        return "FinancasEntity{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", tag=" + tag +
                '}';
    }
}
