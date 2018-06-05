package com.tweener.simplemoviedb.core.domain.usecase.definition

/**
 * @author Vivien Mahe
 */
abstract class UseCaseParams<out T, in Input : UseCaseParams.InputParams> : UseCase() {

    abstract fun execute(params: Input): T

    open class InputParams
}