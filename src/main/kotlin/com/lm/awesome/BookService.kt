package com.lm.awesome

interface BookService {
    fun inStock(bookId: Int): Boolean
    fun lend(bookId: Int, memberId: Int)
}