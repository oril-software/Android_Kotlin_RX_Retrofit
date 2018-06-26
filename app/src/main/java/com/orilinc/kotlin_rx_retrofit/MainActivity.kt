package com.orilinc.kotlin_rx_retrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.orilinc.kotlin_rx_retrofit.rest.GitHubService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    lateinit var progressView: View

    val gitHubService by lazy {
        GitHubService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressView = findViewById(R.id.progress)

        gitHubService.getRepositoryList("kotlin")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { progressView.visibility = View.VISIBLE }
                .subscribe(
                        { result ->
                            progressView.visibility = View.GONE
                            Toast.makeText(this, result.items.toString(), Toast.LENGTH_SHORT).show()
                        },
                        { error ->
                            progressView.visibility = View.GONE
                            Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show()
                        }
                )
    }
}
