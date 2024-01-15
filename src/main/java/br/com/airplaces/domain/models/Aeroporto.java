package br.com.airplaces.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aeroportos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    @Embedded
    public Endereco endereco;
    public String numero;
}
