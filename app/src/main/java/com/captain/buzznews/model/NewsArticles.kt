package com.captain.buzznews.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.captain.buzznews.model.NewsArticles.NewsArticles.tableName
import com.google.gson.annotations.SerializedName

@Entity(tableName = tableName)
data class NewsArticles(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    @ColumnInfo(name = NewsArticles.Column.author)
    @SerializedName(NewsArticles.Column.author)
    val author:String? = null,

    @ColumnInfo(name = NewsArticles.Column.title)
    @SerializedName(NewsArticles.Column.title)
    val title: String? = null,

    @ColumnInfo(name = NewsArticles.Column.description)
    @SerializedName(NewsArticles.Column.description)
    val description: String? = null,


    @ColumnInfo(name = NewsArticles.Column.url)
    @SerializedName(NewsArticles.Column.url)
    val url: String? = null,


    @ColumnInfo(name = NewsArticles.Column.urlToImage)
    @SerializedName(NewsArticles.Column.urlToImage)
    val urlToImage: String? = null,

    @ColumnInfo(name = NewsArticles.Column.publishedAt)
    @SerializedName(NewsArticles.Column.publishedAt)
    val publishedAt: String? = null
){

    object NewsArticles{
        const val tableName = "news_article"

        object Column {
            const val id = "id"
            const val author = "author"
            const val title = "title"
            const val description = "description"
            const val url = "url"
            const val urlToImage = "urlToImage"
            const val publishedAt = "publishedAt"
        }
    }
}