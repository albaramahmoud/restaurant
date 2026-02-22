package com.albara.restaurant.dtos;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewCreateUpdateRequest {
    private String content;
    private Integer rating;
    private List<String> photoIds;

}
