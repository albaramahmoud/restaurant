package com.albara.restaurant.repository;

import com.albara.restaurant.model.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {

    // TODO: custom queries

}
