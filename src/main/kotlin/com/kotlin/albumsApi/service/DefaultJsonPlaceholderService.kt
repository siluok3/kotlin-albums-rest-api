package com.kotlin.albumsApi.service

import com.kotlin.albumsApi.entity.Album
import com.kotlin.albumsApi.entity.Photo
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class DefaultJsonPlaceholderService(private val restTemplate: RestTemplate): JsonPlaceholderService {
    private val jsonPlaceholderBaseUrl = "https://jsonplaceholder.typicode.com/"

    override fun getAllAlbums(): List<Album> {
        val response = restTemplate.exchange(
            "$jsonPlaceholderBaseUrl/albums",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<List<Album>>() {}
        )

        return response.body ?: emptyList()
    }

    override fun getPhotosByAlbumId(albumId: Long): List<Photo> {
        val response = restTemplate.exchange(
            "$jsonPlaceholderBaseUrl/photos?albumId=$albumId",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<List<Photo>>() {}
        )

        return response.body ?: emptyList()
    }
}