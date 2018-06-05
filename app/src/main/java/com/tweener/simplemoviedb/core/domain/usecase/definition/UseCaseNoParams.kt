package com.tweener.simplemoviedb.core.domain.usecase.definition

/**
 * @author Vivien Mahe
 */
abstract class UseCaseNoParams<out T> : UseCase() {

    abstract fun execute(): T
}