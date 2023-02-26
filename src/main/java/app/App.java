package app;

import java.sql.Ref;

import app.modelo.entidade.Chamado;
import app.modelo.entidade.Tecnico;
import app.util.Reflexao;

public class App {

    public static void main(String[] args) {
        
        Chamado ch = new Chamado();
        ch.setAutor("Marcio");

        System.out.println(ch.getAutor());

        Reflexao.teste(ch);
        // Reflexao.teste("palavra");
        // Reflexao.teste(123);
        Reflexao.teste(new Tecnico());


        String ddl = Reflexao.ddl(Chamado.class);
        System.out.println(ddl);

        System.out.println(Reflexao.ddl(Tecnico.class));

    }
}
