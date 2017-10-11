package jp.techacademy.rie.kawagoe.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = 10;
        Log.d("javatest", String.valueOf(num));

        // numに50を代入する
        num = 50;
        Log.d("javatest", String.valueOf(num));
    }
}
