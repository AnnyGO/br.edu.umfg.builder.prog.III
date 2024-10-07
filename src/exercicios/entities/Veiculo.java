package exercicios.entities;

public class Veiculo {
    private String tipo;
    private String cor;
    private int quantidadeRodas;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
    @Override
    public String toString(){
        return "TIPO: " + this.tipo + " | COR: " + this.cor + " | QUANTIDADE DE RODAS: " + this.quantidadeRodas;
    }
}
