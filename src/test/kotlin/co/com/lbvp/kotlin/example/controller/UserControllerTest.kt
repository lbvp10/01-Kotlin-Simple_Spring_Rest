package co.com.lbvp.kotlin.example.controller

import co.com.lbvp.kotlin.jpa.controller.UserController
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations


class UserControllerTest {

    @InjectMocks
    private lateinit var userController: UserController

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    fun findUser() {
        Assert.assertEquals(userController.findUser(),"Hello world")
    }
}