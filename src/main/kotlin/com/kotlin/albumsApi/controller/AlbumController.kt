package com.kotlin.albumsApi.controller

import com.kotlin.albumsApi.entity.Album
import com.kotlin.albumsApi.service.JsonPlaceholderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/albums")
class AlbumController(private val service: JsonPlaceholderService) {
    @GetMapping
    fun getAllAlbums(): List<Album> = service.getAllAlbums()
}