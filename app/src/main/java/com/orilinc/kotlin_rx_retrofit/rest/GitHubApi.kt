package com.orilinc.kotlin_rx_retrofit.rest

import com.orilinc.kotlin_rx_retrofit.model.GitHubResponse
import com.orilinc.kotlin_rx_retrofit.model.entity.Repo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author eugenii.samarskyi.
 */
interface GitHubApi {

    @GET("search/repositories")
    fun getRepositoryList(@Query("q") q: String): Observable<GitHubResponse<Repo>>
}