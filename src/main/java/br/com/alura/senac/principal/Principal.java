package br.com.alura.senac.principal;

import br.com.alura.senac.model.Fabricante;
import br.com.alura.senac.model.Produto;
import br.com.alura.senac.repository.FabricanteRepository;
import br.com.alura.senac.repository.ProdutoRepository;

import java.util.Optional;
import java.util.Scanner;

public class Principal {
        private ProdutoRepository produtoRepository;
        public FabricanteRepository fabricanteRepository;
        private Scanner leitura = new Scanner(System.in);

        public Principal(FabricanteRepository fabricanteRepository) {
            this.fabricanteRepository = fabricanteRepository;
        }
        public Principal(ProdutoRepository produtoRepository) {
            this.produtoRepository = produtoRepository;
        }

        public Principal(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository) {
        }

        public void exibeMenu(){

            var opcao = -1;
            while (opcao != 0) {
                var menu = """
                    =========== MENU Farmácia Senac ===========
                                    
                    Selecione uma opção:
                    -------------------------------------------
                    |                                           |
                    |1 - Cadastrar novo produto.                |
                    |2 - Listar produtos.                       |
                    |3 - Editar produto.                        |
                    |4 - Deletar produto.                       |
                    |9 - Sair                                   |
                    |                                           |
                    --------------------------------------------
                       """;

                System.out.println(menu);
                leitura.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarProduto();
                        break;
                    case 2:
                        listarProdutos();
                        break;
                    case 3:
                        editarProduto();
                        break;
                    case 4:
                        deletarProduto();
                        break;

                    case 9:
                        System.out.println("Encerrando aplicação... Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }

        private void cadastrarProduto() {
            System.out.println("Informe o nome do fabricante: ");
            var nomeFabricante = leitura.nextLine();
            var fabricante = new Fabricaante(nomeFabricante);
            fabricanteRepository.save(fabricante);

            System.out.println("Informe o nome do produto: ");
            var nomeProduto = leitura.nextLine();

            System.out.println("Informe a descrição do produto: ");
            var descricaoProduto = leitura.nextLine();

            System.out.println("Informe o preço do produto: ");
            var precoProduto = leitura.nextDouble();

            var produto = new Produto(nomeProduto, descricaoProduto, precoProduto, fabricante);
            produtoRepository.save(produto);
            System.out.println("Produto cadastrado com sucesso!");
        }

        private void listarProdutos(){
            var produtos = produtoRepository.findAll();
            produtos.forEach(produtos) -> System.out::println(produtos);
        }

        private void editarProduto(){
            System.out.println("Informe o id do produto para editar: ");
            var id = leitura.nextInt();
            leitura.nextLine();

            Optional<produto> produtoOptional = produtoRepository.findById(id);
            if (produtoOptional.isEmpty()) {
                System.out.println("Produto não encontrado!");
            } else {
                System.out.println("Informe a descrição do produto para atualizar: ");
                var descricaoProduto = leitura.nextLine();
                var produto = produtoOptional.get();
                produto.setDescicao(descricaoProduto);
                produtoRepository.save(produto);
                System.out.println("A descrição foi atualizada com sucesso.");
            }
        }

        private void deletarProduto() {
            System.out.println("Informe o id do produto a ser deletado: ");
            var id = leitura.nextInt();
            leitura.nextLine();

            Optional<Produto.Produto> produtoOptional = produtoRepository.findById(id);
            if (produtoOptional.isEmpty()) {
                System.out.println("Produto não encontrado!!! \n");
            } else {
                produtoRepository.deleteById(id);
                System.out.println("Produto deletado com sucesso!!! \n");
            }

        }

    }

