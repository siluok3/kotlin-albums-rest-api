package com.kotlin.albumsApi.service

import com.kotlin.albumsApi.entity.Album
import com.kotlin.albumsApi.entity.Photo

interface JsonPlaceholderService {
    fun getAllAlbums(): List<Album>
    fun getPhotosByAlbumId(albumId: Long): List<Photo>
}