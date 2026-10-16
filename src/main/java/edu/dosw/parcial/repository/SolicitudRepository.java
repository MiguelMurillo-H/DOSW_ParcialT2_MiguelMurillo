package edu.dosw.parcial.repository;

import edu.dosw.parcial.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Long> {}