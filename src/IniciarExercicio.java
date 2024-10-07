import exercicios.builders.PizzaBuilder;
import exercicios.builders.RelatorioBuild;
import exercicios.builders.VeiculoBuilder;
import exercicios.entities.Pizza;
import exercicios.entities.Relatorio;
import exercicios.entities.Veiculo;

public class IniciarExercicio {
   public static void minhasPizzas(){
       Pizza frango = new PizzaBuilder()
               .setMassa("Napolitana")
               .setTamanho("P")
               .setIngredientes("Frango, Queijo, Molho de Tomate")
               .build();
       System.out.println(frango.toString());
   }

   public static void meusVeiculos (){
       Veiculo golQuadrado = new VeiculoBuilder()
               .setTipo("Carro")
               .setCor("Branco")
               .setQuantidadeRodas(4)
               .build();
       System.out.println(golQuadrado.toString());
   }

   public static void meusRelatorios(){
       Relatorio primeiraAula = new RelatorioBuild()
               .setTitulo("Primeira Aula")
               .setCorpo("Estou na minha primeira aula sobre Padrão Build, é muito massa!")
               .setRodape("By Ana Carolina")
               .build();
       System.out.println(primeiraAula.toString());
   }
}
