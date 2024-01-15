package br.com.airplaces.repositorys;

import br.com.airplaces.domain.models.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {
}
