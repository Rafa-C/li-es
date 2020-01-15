import java.util.*;

public class exercicio2 {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new ArrayList<>();
        Random aleatorio = new Random();

        for(int contador=0; contador<=20; contador++){
            numerosAleatorios.add(aleatorio.nextInt(20));
        }
        System.out.println(numerosAleatorios);

        Map<String,String> mapaPaises = new HashMap<>();
        mapaPaises.put("Brasil","Brasilia");
        mapaPaises.put("França", "Paris");
        mapaPaises.put("Portugal", "Lisboa");
        mapaPaises.put("Egito", "Cairo");
        mapaPaises.put("Japao", "Toquio");

        if(mapaPaises.containsKey("Brasil")){
            System.out.println("Olá Brasil");
        }
        else{
            System.out.println(mapaPaises);
        }


    }
}
