package domain;

import java.util.Objects;

public class TipoVeiculo {


    private Long id;
    private String descricao;

    public TipoVeiculo() {
    }

    public TipoVeiculo(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoVeiculo cor)) return false;
        return Objects.equals(id, cor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
