package com.example.jetpackandroid.feature.posts


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jetpackandroid.R
import com.example.jetpackandroid.core.designSystem.SyhLoadingWheel
import com.example.jetpackandroid.postData.Post

@Composable
internal fun PostsRoute(
    onTopicClick: (String) -> Unit,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    viewModel: PostsViewModel = hiltViewModel(),
) {
    /*
    val postState by viewModel.postUiState.collectAsStateWithLifecycle()
    PostsScreen(
        postState = postState,
        modifier = modifier,
    )
    */
}

@Composable
internal fun PostsScreen(
    postState: PostUiState,
    modifier: Modifier = Modifier,
) {
    when (postState) {
        PostUiState.Loading -> LoadingState(modifier)
        is PostUiState.Success -> if (postState.feed.isNotEmpty()) {
            PostsGrid(
                postState,
                modifier,
            )
        } else {
            EmptyState(modifier)
        }
    }
}


@Composable
private fun LoadingState(modifier: Modifier = Modifier) {
    SyhLoadingWheel(
        contentDesc = stringResource(id = R.string.saved_loading),
        modifier = modifier
            .fillMaxWidth()
            .wrapContentSize()
            .testTag("forYou:loading"),
    )
}

@Composable
private fun PostsGrid(
    postState: PostUiState,
    modifier: Modifier,
) {
    ;
}


@Composable
private fun EmptyState(modifier: Modifier = Modifier) {
    ;
}

sealed interface PostUiState {
    object Loading : PostUiState

    data class Success(
        val feed: List<Post>,
    ) : PostUiState
}