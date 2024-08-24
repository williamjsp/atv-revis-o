package aplicacao;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto1, produto2;
        produto1 = new Produto();
        produto2 = new Produto();

        System.out.println("Digite os dados do produtos: ");
        System.out.println("Nome: ");
        produto1.nome = scan.next();
        System.out.println("Preço: ");
        produto1.preco = scan.nextDouble();

        System.out.println("Nome: ");
        produto2.nome = scan.next();
        System.out.println("Preço: ");
        produto2.preco = scan.nextDouble();

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto2);
        listaProdutos.add(produto2);

        for(Produto lista : listaProdutos){
            System.out.println(lista);
        }
    }
}
