package exercicios.builders;
import exercicios.entities.Relatorio;

public class RelatorioBuild {
    Relatorio relatorio = new Relatorio();

    public RelatorioBuild setTitulo (String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuild setCorpo (String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuild setRodape (String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build (){
        //posso colocar validações dos atributos no build
        return this.relatorio;
    }
}
