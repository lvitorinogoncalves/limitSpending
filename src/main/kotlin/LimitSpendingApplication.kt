package br.com.limitspending

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LimitSpendingApplication

fun main(args: Array<String>) {
    runApplication <LimitSpendingApplication>(*args)
}
