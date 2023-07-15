package domain;

import java.util.Objects;

public class Modelo {


    private Long id;
    private Marca marca;
    private String descricao;

    public Modelo() {
    }

    public Modelo(Long id, Marca marca, String descricao) {
        this.id = id;
        this.marca = marca;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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
        if (!(o instanceof Modelo modelo)) return false;
        return Objects.equals(id, modelo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

