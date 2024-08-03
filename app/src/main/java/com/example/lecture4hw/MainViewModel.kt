package com.example.lecture4hw

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class Post(val title: String, val description: String)

data class PostListState(
    val posts: List<Post> = List(10) {
        Post(
            "Post Title",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam molestie nisl ac faucibus blandit. Donec quis nulla quis quam vestibulum egestas at eget velit. Praesent nec ex quis nisl ullamcorper euismod. Vestibulum accumsan a…"
        )
    }
)

class MainViewModel : ViewModel() {
    private val _state = mutableStateOf(PostListState())
    val state: State<PostListState> = _state
}