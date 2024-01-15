package br.com.airplaces.domain.dtos;

public record AeroportoRequestDTO(
        String nome,
        String cep,
        String numero
) {
}
