package com.onurilyastokay.unittestexample.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.onurilyastokay.unittestexample.models.User;

public class UserServiceTest {
    
    @Mock
    private User mockedUser;

    @Test
    public void whenCreateUser_shouldEqualsWithIdAndNameParameters() {
        UserService userService = new UserService();
        String name = "Onur";
        int id = 1;
        
        mockedUser = userService.createUser(id, name);
        
        assertEquals(name, mockedUser.getName());
        assertEquals(id, mockedUser.getId());
    }

    @Test
    public void whenCreateUser_shouldIdCannotBeLessThanZero() {
        UserService userService = new UserService();
        String name = "Onur";
        int id = -5;
        assertThrows(IllegalArgumentException.class, () -> userService.createUser(id, name));
    }
}
