package com.practice.todoapp.todowebapp.todo;

import com.practice.todoapp.todowebapp.TodowebappApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TodowebappApplication.class)
public class TodoTest {

    @public


//    @Test
//    public void testTodo(){
//
//        final Todo itemA = new Todo();
//        final Todo itemB1 = new Todo(1, "abc", "Learn AWS",LocalDate.now(),false);
//        final Todo itemB2 = new Todo(1, "abc", "Learn AWS",LocalDate.now(),false);;
//        final Object nonTodo = new Object();
//        Assertions.assertTrue(itemA.equals(itemA));
//        Assertions.assertFalse(itemA.equals(null));
//        Assertions.assertFalse(itemA.equals(nonTodo));
//        Assertions.assertFalse(itemA.equals(itemB1));
//        Assertions.assertTrue(itemB1.equals(itemB2));
//        Assertions.assertFalse(itemB1.equals(itemA));
////        final Todo todo = new Todo();
////        final Todo todo1 = new Todo(1,"abc","Learn AWS", LocalDate.now(),false);
////        final Todo todo2 = new Todo(1,"abc","Learn AWS", LocalDate.now(),false);
////        final Object nonTodo = new Object();
//////        assertEquals(todo, todo);
//////        assertNotEquals(null, todo);
////        assertNotEquals(todo, nonTodo);
//////        assertNotEquals(todo, todo1);
////        assertEquals(todo1, todo2);
////        assertNotEquals(todo1, todo);
//
//
//    }



}
