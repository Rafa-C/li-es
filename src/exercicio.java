import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class exercicio {
    public static void main(String[] args) {
        List<String> MelhoresTimesdeFutebol = new ArrayList<>();
        MelhoresTimesdeFutebol.add("Liverpool");
        MelhoresTimesdeFutebol.add("Juventus");
        MelhoresTimesdeFutebol.add("XV de Piracicaba");

        Collections.sort(MelhoresTimesdeFutebol);
        System.out.println("Clubes" + MelhoresTimesdeFutebol);

        Map<String, Integer> mapaFuncionarios = new HashMap<>();
        mapaFuncionarios.put("Wagner", 900);
        mapaFuncionarios.put("Jerfferson", 899);
        mapaFuncionarios.put("José", 320);
        mapaFuncionarios.put("Eliana", 432);

        System.out.println(mapaFuncionarios);






    }
}
