package com.albara.restaurant.services.impl;

import com.albara.restaurant.model.Photo;
import com.albara.restaurant.services.PhotoService;
import com.albara.restaurant.services.StorageService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final StorageService storageService;

    public Photo uploadPhoto(MultipartFile file){
        String photoId = UUID.randomUUID().toString();
        String url = storageService.store(file,photoId);


        return Photo.builder()
                .url(url)
                .uploadedTime(LocalDateTime.now())
                .build();
    }
    public Optional<Resource> getPhotoAsResource(String id){

        return storageService.loadAsResource(id);
    }

}
