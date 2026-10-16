package java.edu.dosw.parcial.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "disponibilidades")
public class DisponibilidadEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false) 
    private LocalDate fecha;

    @Column(nullable = false) 
    private LocalTime horaInicial;

    @Column(nullable = false) 
    private LocalTime horaFinal;

    private String lugar;

    @Enumerated(EnumType.STRING) 
    
    @Column(nullable = false) 
    private DisponibilidadModel.Modalidad modalidad;

    @Enumerated(EnumType.STRING) 
    
    @Column(nullable = false) 
    private DisponibilidadModel.EstadoDisponibilidad estado;

    @Column(nullable = false) 
    private String correoTutor;

    @Column(nullable = false) 
    private String materia;

    protected DisponibilidadEntity() {

    }

    public DisponibilidadEntity(Long id, LocalDate fecha, LocalTime horaInicial, LocalTime horaFinal, String lugar, DisponibilidadModel.Modalidad modalidad, DisponibilidadModel.EstadoDisponibilidad estado, String correoTutor, String materia) { 
        this.id=id; 
        this.fecha=fecha; 
        this.horaInicial=horaInicial; 
        this.horaFinal=horaFinal; 
        this.lugar=lugar; 
        this.modalidad=modalidad; 
        this.estado=estado; 
        this.correoTutor=correoTutor; 
        this.materia=materia; 
    }

    public Long getId(){
        return id;
    } 
    
    public LocalDate getFecha(){
        return fecha;
    } 
    
    public LocalTime getHoraInicial(){
        return horaInicial;
    } 
    
    public LocalTime getHoraFinal(){
        return horaFinal;
    } 
    public String getLugar(){
        return lugar;
    } 
    public DisponibilidadModel.Modalidad getModalidad(){
        return modalidad;
    } 
    public DisponibilidadModel.EstadoDisponibilidad getEstado(){
        return estado;
    } 
    public String getCorreoTutor(){
        return correoTutor;
    } 
    public String getMateria(){
        return materia;
    }
}