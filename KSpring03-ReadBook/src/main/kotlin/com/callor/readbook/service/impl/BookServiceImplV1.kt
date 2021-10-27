package com.callor.readbook.service.impl

import com.callor.readbook.model.Book
import com.callor.readbook.model.ReadBook
import com.callor.readbook.repository.BookRepository
import com.callor.readbook.service.BookService

class BookServiceImplV1(val bRepo:BookRepository ):BookService {

    override fun insert(book: Book): Book {
        TODO("Not yet implemented")
    }

    override fun insert(readBook: ReadBook): ReadBook {
        TODO("Not yet implemented")
    }

}