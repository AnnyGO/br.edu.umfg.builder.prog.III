package exercicios.builders;

import exercicios.entities.Veiculo;

public class VeiculoBuilder {
    Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo (String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }
    public VeiculoBuilder setCor (String cor){
        this.veiculo.setCor(cor);
        return this;
    }
    public VeiculoBuilder setQuantidadeRodas (int quantidadeRodas){
        this.veiculo.setQuantidadeRodas(quantidadeRodas);
        return this;
    }
    public Veiculo build (){
        return this.veiculo;
    }
}
