package com.albara.restaurant.services;

import com.albara.restaurant.dtos.RestaurantCreateUpdateRequest;
import com.albara.restaurant.model.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RestaurantService {

    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);

    Page<Restaurant> searchRestaurants(
            String query,
            Float minRating,
            Float latitude,
            Float longitude,
            Float radius,
            Pageable pageable
    );

    Optional<Restaurant> getRestaurant(String id);
    Restaurant updateRestaurant(String id, RestaurantCreateUpdateRequest request);


    void deleteRestaurant(String id);
}
