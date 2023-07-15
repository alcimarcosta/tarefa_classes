package controller;

import domain.*;

public class Main {
    public static void main(String[] args) {

        Cor cor = new Cor(1L, "Azul");
        Marca marca = new Marca(1L, "Chevrolet");
        Modelo modelo = new Modelo(1L, marca, "Camaro");
        TipoVeiculo tipoVeiculo = new TipoVeiculo(1L, "Carro");

        Veiculo veiculo = new Veiculo();
        veiculo.setId(1L);
        veiculo.setCor(cor);
        veiculo.setModelo(modelo);
        veiculo.setTipoVeiculo(tipoVeiculo);
        veiculo.setPlaca("BRA2E19");

        System.out.println(veiculo.exibirDadosVeiculoDetalhado());

    }
}
