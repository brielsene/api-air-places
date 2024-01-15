package br.com.airplaces.services;

import br.com.airplaces.domain.dtos.AeroportoRequestDTO;
import br.com.airplaces.domain.models.Aeroporto;
import br.com.airplaces.http.CepClient;
import br.com.airplaces.repositorys.AeroportoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeroportoService {

    @Autowired
    private AeroportoRepository aeroportoRepository;

    @Autowired
    private CepClient cepClient;
    @Transactional
    public void registraAeroporto(AeroportoRequestDTO aeroportoRequestDTO){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setEndereco(cepClient.getEndereco(aeroportoRequestDTO.cep()));
        aeroporto.setNome(aeroportoRequestDTO.nome());
        aeroporto.setNumero(aeroportoRequestDTO.numero());
        aeroportoRepository.save(aeroporto);
    }
}
