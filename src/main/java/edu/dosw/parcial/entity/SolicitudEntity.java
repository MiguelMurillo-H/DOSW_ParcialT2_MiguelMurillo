package java.edu.dosw.parcial.entity;

import java.edu.dosw.parcial.model.SolicitudModel;
import jakarta.persistence.*;

@Entity
@Table(name = "solicitudes")
public class SolicitudEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @OneToOne(optional = false) 
    @JoinColumn(name = "disponibilidad_id", nullable = false, unique = true) 
    private DisponibilidadEntity disponibilidad;
    
    @Column(nullable = false) 
    private String correoSolicitante;
    @Enumerated(EnumType.STRING) 
    
    @Column(nullable = false) 
    private SolicitudModel.EstadoSolicitud estado;
    protected SolicitudEntity() {

    }
    public SolicitudEntity(Long id, DisponibilidadEntity disponibilidad, String correoSolicitante, SolicitudModel.EstadoSolicitud estado) { 
        this.id=id; 
        this.disponibilidad=disponibilidad; 
        this.correoSolicitante=correoSolicitante; 
        this.estado=estado; 
    }

    public Long getId(){
        return id;
    } 
    public DisponibilidadEntity getDisponibilidad(){
        return disponibilidad;
    } 
    public String getCorreoSolicitante(){
        return correoSolicitante;
    } 
    public SolicitudModel.EstadoSolicitud getEstado(){
        return estado;
    }
}