package com.albara.restaurant.services;

import com.albara.restaurant.dtos.GeoLocation;
import com.albara.restaurant.model.Address;

public interface GeoLocationService {

    GeoLocation geoLocate(Address address);

}
