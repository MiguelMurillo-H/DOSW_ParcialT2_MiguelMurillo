package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.DisponibilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DisponibilidadRepository extends JpaRepository<DisponibilidadEntity, Long> {
    List<DisponibilidadEntity> findAllByCorreoTutor(String correoTutor);
    long countByCorreoTutor(String correoTutor);
}