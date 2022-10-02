package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClassroomTest {

    Classroom classroom;

    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Course name should be set")
    void testSetCourseName() {
        assertEquals("Math", classroom.setCourseName("Math"), "Any course name should work");
    }

    @Test
    @DisplayName("Grade should be set")
    void testSetGrade() {
        assertEquals(94, classroom.setGrade(94), "Any grade should work");
    }


    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("user@gmail.com", classroom.setEmail("user@gmail.com"), "Any Email should work");
    }

    @Test
    @DisplayName("Classroom type should be set")
    void testSetClassroomType() {
        assertEquals(classroomType.MORNING, classroom.setClassoomType(classroomType.MORNING), "Clasroom type should be set for one of the two given types");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("305 W 45th St, New York NY 10036", classroom.setAddress("305 W 45th St, New York NY 10036"), "Any address should work");
    }
    @Test
    @DisplayName("Phone number should be set")
    void testSetPhoneNumber() {
        assertEquals("+91-12345678", classroom.setPhoneNumber("+91-12345678"), "Any phone number should work");
    }
}