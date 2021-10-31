package com.callor.readbook.service

import com.callor.readbook.model.Book
import com.callor.readbook.model.ReadBook

interface BookService {

    fun insert(book: Book): Book
    fun insert(readBook: ReadBook): ReadBook

}