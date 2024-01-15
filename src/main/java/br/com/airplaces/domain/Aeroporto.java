package br.com.airplaces.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "aeroportos")
public class Aeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    @Embedded
    public Endereco endereco;
}
