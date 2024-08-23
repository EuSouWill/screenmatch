package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2022);
        meuFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2000);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2005);



        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);


        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação" + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("will");
        buscaPorArtista.add("kami");
        buscaPorArtista.add("ariel");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);


        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenados: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);

    }
}
