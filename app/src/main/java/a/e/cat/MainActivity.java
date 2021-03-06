package a.e.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Constructor;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Gson gson = new Gson();
       /*
        Cat cat = new Cat("Мурзик", 9, android.R.color.black);
        String json = gson.toJson(cat);
        */
        String json = "{\"name\":\"Мурзик\",\"age\":9,\"color\":17170444}";
        Cat cat = gson.fromJson(json, Cat.class);

        textView.setText(String.valueOf("Кот:" + json));
    }

}