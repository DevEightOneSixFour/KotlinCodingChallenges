package com.example.kotlincodechallenges.uber

import io.reactivex.rxjava3.core.Observable

fun main(args: Array<String>) {
    val items = listOf("1", "2", "3", "4", "5", "6")
    Observable.fromIterable(items)
        .switchMap { s: String -> Observable.just(s + "x") }
        .toList()
        .doOnSuccess { x: List<String>? -> println(x) }
        .subscribe()
}
