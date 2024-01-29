package yeo.chi.multi_module

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiModuleApplication

fun main(args: Array<String>) {
	runApplication<MultiModuleApplication>(*args)
}
