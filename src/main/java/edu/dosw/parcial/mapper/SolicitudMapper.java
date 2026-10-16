package java.edu.dosw.parcial.mapper;

import java.edu.dosw.parcial.entity.SolicitudEntity;
import java.edu.dosw.parcial.model.SolicitudModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SolicitudMapper {
    @Mapping(target = "disponibilidadId", source = "disponibilidad.id")
    SolicitudModel toModel(SolicitudEntity entity);
}
