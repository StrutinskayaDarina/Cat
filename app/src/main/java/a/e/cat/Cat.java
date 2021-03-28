package a.e.cat;

import android.graphics.Color;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Constructor;

public class Cat {
    private String name;
    private Integer age;
    private Integer color;

    public Cat(String name, Integer age, Integer color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
