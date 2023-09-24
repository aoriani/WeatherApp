package io.aoriani.weather.domain.models

sealed interface Result<out T> {
    data class Success<out T>(val data: T): Result<T>
    data object NotFound: Result<Nothing>
    data object Unknown: Result<Nothing>
}