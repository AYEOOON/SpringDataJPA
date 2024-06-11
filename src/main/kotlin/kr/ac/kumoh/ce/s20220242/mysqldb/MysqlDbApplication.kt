package kr.ac.kumoh.ce.s20220242.mysqldb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MysqlDbApplication

fun main(args: Array<String>) {
	runApplication<MysqlDbApplication>(*args)
}
