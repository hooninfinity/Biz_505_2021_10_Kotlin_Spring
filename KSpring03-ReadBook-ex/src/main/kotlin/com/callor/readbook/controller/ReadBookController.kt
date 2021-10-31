package com.callor.readbook.controller

import com.callor.readbook.model.Book
import com.callor.readbook.model.ReadBook
import com.callor.readbook.service.BookService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@RequestMapping(value = ["/read"])
@Controller
class ReadBookController(val bService:BookService) {

    @RequestMapping(value = ["/insert"], method = [RequestMethod.GET])
    fun insert():String {
        return "write"
    }

    @RequestMapping(value = ["/insert"], method = [RequestMethod.POST])
    fun insert(book: Book, readBook: ReadBook):String {
        bService.insert(book)
        bService.insert(readBook)
        return "redirect:/read/insert"
    }



}