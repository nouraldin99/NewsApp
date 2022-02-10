package user.nourdev.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.IdRes
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import user.nourdev.newsapp.R
import user.nourdev.newsapp.databinding.ActivityNewsBinding
import user.nourdev.newsapp.db.ArticleDatabase
import user.nourdev.newsapp.repository.NewsRepository


class NewsActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewsBinding
    lateinit var viewModel: NewsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val newsRepository = NewsRepository(ArticleDatabase.getInstance(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application,newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        // set content view
        binding =  ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavigationView.setupWithNavController(findNavController(viewId = R.id.newsNavHostFragment))

    }
}