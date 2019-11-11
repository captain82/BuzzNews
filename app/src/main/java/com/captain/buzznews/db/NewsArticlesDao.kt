package com.captain.buzznews.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.captain.buzznews.model.NewsArticles

@Dao
interface NewsArticlesDao {

    @Insert
    fun insertArticles(articles: List<NewsArticles>): List<Long>


    @Query("SELECT * FROM news_article")
    suspend fun getNewsArticles(): List<NewsArticles>
}