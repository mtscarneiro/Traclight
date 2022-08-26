package mtscarneiro.tracflight

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class TracflightApplication

fun main(args: Array<String>) {
    SpringApplication.run(TracflightApplication::class.java, *args)
}
