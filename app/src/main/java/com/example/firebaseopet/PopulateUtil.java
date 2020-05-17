package com.example.firebaseopet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

class PopulateUtil {
    public static List<Pessoa> loadPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "José";
        pessoa.qtde_filhos = 2;
        pessoa.salario = 1000.05;
        pessoa.ativo = false;
        pessoa.pets = Arrays.asList("Joaozin","clebin");
        pessoa.data_aniversario = new GregorianCalendar(1995, Calendar.APRIL,15).getTime();

        pessoas.add(pessoa);

        pessoa = new Pessoa();
        pessoa.nome = "Marcia";
        pessoa.qtde_filhos = 3;
        pessoa.salario = 3000.55;
        pessoa.ativo = true;
        pessoa.pets = Arrays.asList("Branquinho","Pretinho");
        pessoa.data_aniversario = new GregorianCalendar(2000, Calendar.MARCH,15).getTime();

        pessoas.add(pessoa);

        pessoa = new Pessoa();
        pessoa.nome = "Leonardo";
        pessoa.qtde_filhos = 0;
        pessoa.salario = 10000.50;
        pessoa.ativo = true;
        pessoa.pets = null;
        pessoa.data_aniversario = new GregorianCalendar(1998, Calendar.SEPTEMBER,28).getTime();

        pessoas.add(pessoa);

        return pessoas;
    }
}