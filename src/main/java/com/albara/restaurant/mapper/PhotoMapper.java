package com.albara.restaurant.mapper;

import com.albara.restaurant.dtos.PhotoDto;
import com.albara.restaurant.model.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
    
    Photo toEntity(PhotoDto photoDto);

    PhotoDto toDto(Photo photo);

}
