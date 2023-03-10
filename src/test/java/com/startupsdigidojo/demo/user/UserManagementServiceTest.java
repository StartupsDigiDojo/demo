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
        User user = new User("something", "something@mail.com");

        // when
        User result = underTest.createUser(user);

        // then
        assertEquals(result.getUsername(), user.getUsername());
    }

    @Test
    void itGivesAnIDWhenCreating() {
        // given
        User user = new User("username", "email@mail.com");

        // when
        User result = underTest.createUser(user);

        // then
        assertEquals(1, result.getId());
    }

    @Test
    void itThrowsWhenCreatingADuplicateUsername() {
        // given
        User user = new User("something", "something@mail.com");
        underTest.createUser(user);

        // then ... when
        assertThrows(IllegalArgumentException.class, () -> underTest.createUser(user));
    }

    @Test
    void itReadsAnExistingOneProvidedTheID() {
        // given
        User user = new User("fulano", "mail@mail.com");
        user = underTest.createUser(user);
        int id = user.getId();

        // when
        User result = underTest.readOne(id);

        // then
        assertEquals(user, result);
    }

    @Test
    void itThrowsWhenReadingNonExistingID() {
        // given
        int id = 42;

        // then ... when
        assertThrows(IllegalArgumentException.class, () -> underTest.readOne(id));
    }
}