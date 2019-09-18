package com.lm.awesome

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

internal class LendBookManagerTest {

    @Test(expected = IllegalStateException::class)
    fun `when book is not available then an exception is thrown`() {

        val mockBookService = mock(BookService::class.java)
        Mockito.`when`(mockBookService.inStock(100)).thenReturn(false)
        val manager = LendBookManager(mockBookService)
        manager.checkout(100, 1)

    }

    //mockito-kotlin
    @Test
    fun `when book is available then lend method is called`() {

        //val mockBookService = mock<BookService>()
        val mockBookService: BookService = mock()
        whenever(mockBookService.inStock(100)).thenReturn(true)
        val manager = LendBookManager(mockBookService)
        manager.checkout(100, 1)
        verify(mockBookService).lend(100, 1)

    }

}