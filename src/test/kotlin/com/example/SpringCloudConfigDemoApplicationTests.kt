package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest(classes = arrayOf(SpringCloudConfigDemoApplication::class))
class SpringCloudConfigDemoApplicationTests {

    @Test
    fun contextLoads() {
    }

}
