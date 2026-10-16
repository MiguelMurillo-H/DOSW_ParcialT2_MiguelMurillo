package java.edu.dosw.parcial.model;

import java.time.LocalDate;
import java.time.LocalTime;

public record DisponibilidadModel(Long id, LocalDate fecha, LocalTime horaInicial, LocalTime horaFinal, String lugar, Modalidad modalidad, EstadoDisponibilidad estado, String correoTutor, String materia) {
    public enum Modalidad { VIRTUAL, PRESENCIAL }
    
    public enum EstadoDisponibilidad { LIBRE, OCUPADO }
}