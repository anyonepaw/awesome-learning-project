package com.lm.awesome

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwesomeApplication

fun main(args: Array<String>) {
	runApplication<AwesomeApplication>(*args)
}
