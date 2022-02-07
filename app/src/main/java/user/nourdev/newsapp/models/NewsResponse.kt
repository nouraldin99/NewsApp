package user.nourstore.sampleapp.models

import user.nourstore.sampleapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)