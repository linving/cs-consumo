package br.com.concrete.consumo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by assis on 14/03/17.
 */
@Entity
public class Transacao {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @NotEmpty
    private String usuario;

    @NotNull
    @Temporal(TemporalType.DATE)
    private LocalDate data;

    @NotNull
    @Column(scale = 5, precision = 0)
    private Long valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Transacao transacao = (Transacao) o;

        return id.equals(transacao.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
