package java.edu.dosw.parcial;

import java.edu.dosw.parcial.entity.DisponibilidadEntity;
import java.edu.dosw.parcial.model.DisponibilidadModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DisponibilidadMapper {
    DisponibilidadModel toModel(DisponibilidadEntity entity);
}