package com.callor.spring.controller

import com.callor.spring.service.OrderService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping(value = ["/order"])
class OrderController(val orService:OrderService) {

    @RequestMapping(value = ["/",""], method = [RequestMethod.GET])
    fun list(model: Model, pageable: Pageable): String {

        val orderList = orService.selectAll(pageable)
        model["SALES"] = orderList
        return "order/list"
    }

    @RequestMapping(value = ["/sub_page"], method = [RequestMethod.GET])
    fun subPage(model: Model, pageable: Pageable): String {
        val orderList = orService.selectAll(pageable)
        model["SALES"] = orderList
        return "order/sub_page"
    }



    // localhost:8080/order/ 또는
    // localhost:8080/order 요청을 모두 수용
    @RequestMapping(value = ["/list"], method = [RequestMethod.GET])
    fun list(model: Model): String {
        val salesList = orService.selectAll()
        model["SALES"] = salesList
        return "order/list"
    }

    @RequestMapping(value = ["/detail"], method = [RequestMethod.GET])
    fun detail(model: Model, @RequestParam("seq") seq: Long): String {
        val order_detail =  orService.findById(seq)
        model["ORDERS"] = order_detail
        return "order/detail"
    }







}