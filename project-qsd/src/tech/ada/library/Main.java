package tech.ada.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Livro novoLivro;

        ArrayList<Livro> listaLivros = new ArrayList<>();

        System.out.println("Bem vindo ao sistema de Biblioteca!");
        System.out.println("----------------------------------");

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("Escolha uma opção: \n 1 - Cadastrar novo livro \n 2 - Listar livros disponíveis");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    novoLivro = new Livro();

                    System.out.println("Digite o nome do livro:");
                    novoLivro.titulo = scanner.nextLine();

                    System.out.println("Digite o nome do autor do livro: ");
                    novoLivro.autor = scanner.nextLine();

                    System.out.println("Digite o nome da editora do livro: ");
                    novoLivro.editora = scanner.nextLine();

                    System.out.println("Digite o ISBN: ");
                    novoLivro.ISBN = Integer.parseInt(scanner.next());

                    listaLivros.add(novoLivro);

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    if(listaLivros.isEmpty()){
                        System.out.println("Não há livros disponíveis!");
                    } else{
                        for (Livro cadaLivro : listaLivros){
                            System.out.println("-------------------------------------");
                            System.out.println("Título do livro: " + cadaLivro.titulo);
                            System.out.println("Autor: " + cadaLivro.autor);
                            System.out.println("Editora: " + cadaLivro.editora);
                            System.out.println("ISBN: " + cadaLivro.ISBN);
                            System.out.println("-------------------------------------");
                        }
                    }

                    System.out.println("Fim da lista.");
                    break;

                case 0:
                    System.out.println("Obrigada por utilizar nosso sistema de Biblioteca!");
                    break;

                default:
                    System.out.print("A opção " + opcao + " não é válida! \nDigite uma opção válida. \n");
                    break;
            }
        } while (opcao != 0);

    }
}
