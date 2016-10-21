package testfx

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

//fun main(args: Array<String>) {
//    ConstructorUtil.getConstructors(SimpleTest::class.java)
//        .forEach { println("constructor: $it") }
//}

class SimpleTest {
    companion object {
        @BeforeAll
        @JvmStatic
        fun setupAll() {
            println("setup all" )
        }
    }

    @BeforeEach
    fun setupEach() {
        println("setup each")
    }

    @Test
    fun succeeds() {
        assertEquals(3, 1 + 2)
    }

    @Test
    @Disabled
    fun fails() {
        assertEquals(4, 1 + 2)
    }
}