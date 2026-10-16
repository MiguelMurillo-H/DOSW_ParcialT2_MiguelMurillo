package java.edu.dosw.parcial.service;

import java.edu.dosw.parcial.DisponibilidadModel;
import java.util.List;

public interface DisponibilidadService {
    DisponibilidadModel crear(DisponibilidadModel disponibilidad);
    List<DisponibilidadModel> consultarTodas();
    List<DisponibilidadModel> consultarPorTutor(String correoTutor);
    DisponibilidadModel consultarPorId(Long id);
    DisponibilidadModel actualizar(Long id, DisponibilidadModel disponibilidad);
    void eliminar(Long id);
    long contarPorTutor(String correoTutor);
}