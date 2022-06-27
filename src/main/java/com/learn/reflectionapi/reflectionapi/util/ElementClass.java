package com.example.reflections.util;

import com.example.reflections.model.Info;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class ElementClass {

    public void print() {
        System.out.println("ElementClass");
    }


    public void getElementClass() throws NoSuchFieldException {

        Class<?> clazz = Info.class;
        Field[] fields =  clazz.getDeclaredFields();
        Field field = clazz.getDeclaredField("publicField");
        Field[] fields1 =  clazz.getFields();
        Class<?> superClazz = clazz.getSuperclass();
        System.out.println("clazz: " + clazz);
        System.out.println("field: " + fields.toString());
        System.out.println("superClazz: " + superClazz);
    }
}
