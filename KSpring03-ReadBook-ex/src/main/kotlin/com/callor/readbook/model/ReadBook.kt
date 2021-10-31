package com.callor.readbook.model

import java.util.*
import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Table(name = "tbl_readBook", schema = "naraDB")
class ReadBook {

    @Id
    @Column(columnDefinition = "CHAR(4)", nullable = false)
    var seq: String? = null

    @Column(columnDefinition = "CHAR(25)", nullable = false)
    var isbn: String? = null


    @Transient
    @Temporal(TemporalType.DATE)
    var rdate: Date? = null

    @Transient
    @Temporal(TemporalType.TIME)
    var stime: Date? = null

    @Transient
    @Temporal(TemporalType.TIME)
    var etime: Date? = null

    @Column(nullable = true)
    var rating: Int? = null

    @Column(columnDefinition = "VARCHAR(255)", nullable = true)
    var comment: String? = null




}