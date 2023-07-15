package domain;

import java.util.Objects;

/**
 * class Veículos. Todos os campos devem ser preenchidos
 */
public class Veiculo {
    private Long id;
    private TipoVeiculo tipoVeiculo;
    private Modelo modelo;
    private Cor cor;
    private String placa;

    public Veiculo(Long id, TipoVeiculo tipoVeiculo, Modelo modelo, Cor cor, String placa) {
        this.id = id;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public Veiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return Objects.equals(id, veiculo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Metodo que retorna dados do veículo
     * @deprecated
     * @see exibirDadosVeiculoDetalhado
     */
    public void exibirDadosVeiculo(){
        System.out.println(
                tipoVeiculo.getDescricao() + " , " +
                modelo.getDescricao() + " , " +
                cor.getDescricao() + " , " +
                placa
        );
    }

    /**
     * Metodo que exibe os dados do veículo de forma detalhada
     */
    public String exibirDadosVeiculoDetalhado(){
        String dadosVeiculo =
                "Tipo de veículo: " + this.tipoVeiculo.getDescricao() + ", " +
                "Modelo: " + modelo.getDescricao() + ", " +
                "Cor: " + cor.getDescricao() + ", " +
                "Placa: " + placa;

        return dadosVeiculo;
    }
}
