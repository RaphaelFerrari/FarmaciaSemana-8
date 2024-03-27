package br.com.alura.senac.model;

import jakarta.persistence.*;

public class Fabricante {

    public Fabricaante(String nomeFabricante) {

    }

    @Entity
    @Table(name = "fabricantes")
    public class Fabricante {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nome;

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

        @Override
        public String toString() {
            return "Fabricante{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    '}';
        }

    }
}
