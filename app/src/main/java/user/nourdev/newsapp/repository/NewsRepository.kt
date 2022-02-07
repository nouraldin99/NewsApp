package user.nourdev.newsapp.repository

import user.nourdev.newsapp.api.RetrofitInstance
import user.nourdev.newsapp.db.ArticleDatabase


class NewsRepository(
    var db: ArticleDatabase? = null
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

}