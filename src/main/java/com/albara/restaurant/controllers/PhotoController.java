package com.albara.restaurant.controllers;

import com.albara.restaurant.dtos.PhotoDto;
import com.albara.restaurant.mapper.PhotoMapper;
import com.albara.restaurant.model.Photo;
import com.albara.restaurant.services.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/photos")
public class PhotoController {

    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public ResponseEntity<PhotoDto> uploadPhoto(@RequestParam("file") MultipartFile  file){
        if (file.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        PhotoDto photoDto = photoMapper.toDto(photoService.uploadPhoto(file));
        return ResponseEntity.ok(photoDto);

    }

    @GetMapping(path = "/{id:.+}")
    public ResponseEntity<Resource> retrievePhoto(
            @PathVariable("id") String id
    ){


        return photoService.getPhotoAsResource(id).map(photo->
                ResponseEntity.ok()
                        .contentType(
                                MediaTypeFactory
                                        .getMediaType(photo)
                                        .orElse(MediaType.APPLICATION_OCTET_STREAM)
                        )
                        .header(HttpHeaders.CONTENT_DISPOSITION,"inline")
                        .body(photo)
        ).orElse(ResponseEntity.notFound().build());
    }

}
