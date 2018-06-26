package com.orilinc.kotlin_rx_retrofit.model

/**
 * @author eugenii.samarskyi.
 */
class GitHubResponse<T> {

    var total_count: Long? = null

    val items: List<T>? = null
}