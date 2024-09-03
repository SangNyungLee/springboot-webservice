package com.jojodu.book.springboot.web;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void plusTest(){
        System.out.println("plusTest");
    }

    // 테스트 시작 전,후 무조건 딱 한번 실행되는 메서드
    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }
    /////////////////

    // 현재 클래스의 모든 테스트 메서드를 실행하기 전, 후에 실행되어야 하는 메서드
    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }

    ///////////////
    // @Disabled : 전체 테스트를 진행했을 때 어떤 단위테스트는 테스트를 진행하지 않도록 하는 어노테이션


}