package com.albara.restaurant.services.impl;

import com.albara.restaurant.model.Photo;
import com.albara.restaurant.services.PhotoService;
import com.albara.restaurant.services.StorageService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final StorageService storageService;

    public Photo uploadPhoto(MultipartFile file){
        // TODO: create a unique file name
        storageService.store(file,"filename");

        return null;
    }
    public Optional<Resource> getPhotoAsResource(String id){
        return null;
    }

}
