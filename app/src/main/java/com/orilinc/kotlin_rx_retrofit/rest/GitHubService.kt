package com.orilinc.kotlin_rx_retrofit.rest

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author eugenii.samarskyi.
 */
class GitHubService {

    companion object {
        private const val baseUrl: String = "https://api.github.com/"

        fun create(): GitHubApi {
            val okHttpClient = OkHttpClient.Builder()
                    .build()

            val retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build()

            return retrofit.create(GitHubApi::class.java)
        }
    }
}