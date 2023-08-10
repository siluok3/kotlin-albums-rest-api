package com.kotlin.albumsApi.service

import com.kotlin.albumsApi.entity.Album
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.mockito.MockitoAnnotations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import org.mockito.Mockito.`when` as mockitoWhen

@SpringBootTest
class DefaultJsonPlaceholderServiceTest {

    @MockBean
    private lateinit var restTemplate: RestTemplate

    @Autowired
    private lateinit var service: DefaultJsonPlaceholderService

    private val jsonPlaceholderBaseUrl = "https://jsonplaceholder.typicode.com/"

    @BeforeEach
    fun init() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun `test get all albums`() {
        val albums = listOf(
            Album(1L, 1L, "Album1"),
            Album(1L, 2L, "Album2")
        )
        val responseEntity = ResponseEntity(albums, HttpStatus.OK)

        mockitoWhen(restTemplate.exchange("$jsonPlaceholderBaseUrl/albums", HttpMethod.GET, null,
            object : ParameterizedTypeReference<List<Album>>() {}))
            .thenReturn(responseEntity)

        val getAllAlbumsResult = service.getAllAlbums()

        assertEquals(albums, getAllAlbumsResult)
    }

    @Test
    fun `test get all albums empty list`() {

    }

    @Test
    fun `test get photos by album`() {
    }

    @Test
    fun `test get photos by album empty list`() {

    }
}