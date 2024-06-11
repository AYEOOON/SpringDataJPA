package kr.ac.kumoh.ce.s20220242.mysqldb

import java.time.LocalDate

data class MechanicJoinGunplaDto (
    val mechanicId: Int,
    val name: String,
    val model: String,
    val gunplaId: Int?, // 가능하면 nullable이 아닌것이 좋다
    val title: String?, // LeftOuterjoin을 하였기 때문
    val grade: String?,
    val date: LocalDate?,
    val price: Int?
)