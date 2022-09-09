package br.org.serratec.teste;

import java.time.LocalDate;

import br.org.serratec.enums.Categoria;
import br.org.serratec.interfaces.Venda;
import br.org.serratec.model.Produto;

public class TesteVenda {

    public static void main(String[] args) {

        Produto p1 = new Produto(555, "Bola Quadrada Eletrônica", 22.99, Categoria.ELETRONICO);
        Produto p2 = new Produto(222, "Disco Voador", 1999.99, Categoria.AUTOMOTIVO);
        Produto p3 = new Produto(999, "Roupa que Brilha no claro", 199.99, Categoria.ROUPAS);
        
        Venda v1 = new Venda(p1, LocalDate.of(2022, 9, 7), 4);
        Venda v2 = new Venda(p2, LocalDate.of(2022, 9, 7), 1);
        Venda v3 = new Venda(p3, LocalDate.of(2022, 9, 7), 3);
        
        System.out.println("Total por Item");
        System.out.println("-------------------------------------");
        
        v1.calcularVenda();
        v2.calcularVenda();
        v3.calcularVenda();
        
        System.out.println(v1.getProduto().getDescricao()+" - " + v1.mostrarVenda() + "\n" + v2.getProduto().getDescricao() + " - "+ v2.mostrarVenda() + "\n"
                + v3.getProduto().getDescricao() + " - "+ v3.mostrarVenda());
        
        System.out.println("-------------------------------------");
        System.out.println("Total Venda Geral:" + Venda.getTotalVenda());
    }
} 
