package br.com.alura.senac.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "produto")
    public class Produto {
        public Produto(String nomeProduto, String descricaoProduto, double precoProduto, Fabricaante){

        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nome;
        private String descricao;
        private double preco;

        @ManyToOne(fetch = FetchType.EAGER)
        private Fabricaante.Fabricante fabricante;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public Fabricaante.Fabricante getFabricante() {
            return fabricante;
        }

        public void setFabricante(Fabricaante.Fabricante fabricante) {
            this.fabricante = fabricante;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", preco=" + preco +
                    ", fabricante=" + fabricante +
                    '}';
        }

    }


