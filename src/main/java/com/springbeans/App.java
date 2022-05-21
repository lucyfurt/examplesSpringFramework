package com.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Mémorias Póstumas de Brás Cubas");
        livro.setCodigo("3FDFG");
        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Machado de Assis");
        livro.exibir();
        factory.close();
    }
}
