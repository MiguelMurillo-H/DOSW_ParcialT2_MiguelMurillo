package java.edu.dosw.parcial.model;

import java.util.List;

public record UsuarioEnlaceModel(String id, String nombre, String programa, Estado estado, Rol rol, Nivel nivel, List<String> materiasInscritas) {
    public enum Estado { 
        ACTIVO, 
        INACTIVO 
    }
    public enum Rol { 
        PROFESOR, 
        ESTUDIANTE 
    }
    public enum Nivel { 
        PREGRADO, 
        POSGRADO 
    }
    public UsuarioEnlaceModel { 
        materiasInscritas = materiasInscritas == null ? List.of() : List.copyOf(materiasInscritas); 
    }
}