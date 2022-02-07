package user.nourdev.newsapp.ui.fragment


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import user.nourdev.newsapp.R
import user.nourdev.newsapp.ui.NewsActivity
import user.nourdev.newsapp.ui.NewsViewModel

class SavedNewsFragment: Fragment(R.layout.fragment_saved_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as NewsActivity).viewModel
    }
}

