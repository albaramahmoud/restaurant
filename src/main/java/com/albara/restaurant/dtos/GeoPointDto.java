package com.albara.restaurant.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeoPointDto {

//    @NotBlank(message = "Latitude is required")
    private Double latitude;

//    @NotBlank(message = "longitude is required")
    private Double longitude;

}
