package com.tweener.simplemoviedb.core.domain.usecase.definition

/**
 * @author Vivien Mahe
 */
abstract class UseCase<out T, in Input : UseCase.InputParams> {

    abstract fun execute(params: Input): T

    open class InputParams
}