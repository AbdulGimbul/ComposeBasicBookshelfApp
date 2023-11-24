package com.abdl.mybookshelfapp.network

import com.abdl.mybookshelfapp.model.BooksResponse
import com.abdl.mybookshelfapp.model.ItemsItem
import retrofit2.http.GET
import retrofit2.http.Path

interface BookshelfService {

    @GET("/books/v1/volumes?q=self-improvement")
    suspend fun getBooks(): BooksResponse

    @GET("/books/v1/volumes/{volumeId}")
    suspend fun getBookDetail(
        @Path("volumeId") volumeId: String
    ): ItemsItem
}