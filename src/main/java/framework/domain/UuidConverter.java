package framework.domain;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

@Converter
public class UuidConverter implements AttributeConverter<UUID, UUID> {
    @Override
    public UUID convertToDatabaseColumn(UUID attribute) {
        return attribute;
    }

    @Override
    public UUID convertToEntityAttribute(UUID dbData) {
        return dbData;
    }
}
