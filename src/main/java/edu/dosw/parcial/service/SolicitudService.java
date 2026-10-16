package java.edu.dosw.parcial.service;

import java.edu.dosw.parcial.SolicitudModel;

public interface SolicitudService {
    SolicitudModel crear(Long disponibilidadId, String correoSolicitante);
}