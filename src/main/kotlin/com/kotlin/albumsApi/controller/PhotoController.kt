package com.kotlin.albumsApi.controller

import com.kotlin.albumsApi.entity.Photo
import com.kotlin.albumsApi.service.JsonPlaceholderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/photos")
class PhotoController(private val service: JsonPlaceholderService) {
    @GetMapping("{albumId}")
    fun getPhotosByAlbumId(@PathVariable albumId: Long): List<Photo> = service.getPhotosByAlbumId(albumId)
}