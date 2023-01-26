package com.startupsdigidojo.demo.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagementServiceTest {
    private UserManagementService underTest;

    @BeforeEach
    void setup() {
        underTest = new UserManagementService();
    }

    @Test
    void itCreatesWithANewUsername() {
        // given
        String username = "something";

        // when
        String result = underTest.createUser(username);

        // then
        assertEquals(result, username);
    }

    @Test
    void itThrowsWhenCreatingADuplicateUsername() {
        // given
        String username = "something";
        underTest.createUser(username);

        // then ... when
        assertThrows(IllegalArgumentException.class, () -> underTest.createUser(username));
    }
}