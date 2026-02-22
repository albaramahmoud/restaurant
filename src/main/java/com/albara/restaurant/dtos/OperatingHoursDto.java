package com.albara.restaurant.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperatingHoursDto {

//    @NotNull(message = "Monday operating hours are required")
    @Valid
    private TimeRangeDto monday;

//    @NotNull(message = "Tuesday operating hours are required")
    @Valid
    private TimeRangeDto tuesday;

//    @NotNull(message = "Wednesday operating hours are required")
    @Valid
    private TimeRangeDto wednesday;

//    @NotNull(message = "Thursday operating hours are required")
    @Valid
    private TimeRangeDto thursday;

//    @NotNull(message = "Friday operating hours are required")
    @Valid
    private TimeRangeDto friday;

//    @NotNull(message = "Saturday operating hours are required")
    @Valid
    private TimeRangeDto saturday;

//    @NotNull(message = "Sunday operating hours are required")
    @Valid
    private TimeRangeDto sunday;

}
