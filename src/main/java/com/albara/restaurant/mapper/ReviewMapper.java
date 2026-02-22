package com.albara.restaurant.mapper;

import com.albara.restaurant.dtos.ReviewCreateUpdateRequest;
import com.albara.restaurant.dtos.ReviewCreateUpdateRequestDto;
import com.albara.restaurant.dtos.ReviewDto;
import com.albara.restaurant.model.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}