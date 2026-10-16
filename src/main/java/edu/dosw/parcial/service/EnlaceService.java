package edu.dosw.parcial.service;
import edu.dosw.parcial.model.UsuarioEnlaceModel;
import java.util.Optional;


public interface EnlaceService {

    
    Optional<UsuarioEnlaceModel> consultarPorCorreo(String correo);
}
