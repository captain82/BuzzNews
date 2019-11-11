package com.captain.buzznews.di

import android.app.Application
import com.captain.buzznews.db.NewsArticlesDao
import com.captain.buzznews.db.NewsDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NewsDatabaseModule {

    @Singleton
    @Provides
    fun providesDb(app:Application):NewsDatabase = NewsDatabase.buildDefault(app)

    @Singleton
    @Provides
    fun provideUserDao(db:NewsDatabase):NewsArticlesDao = db.newsArticlesDao()
}