package com.taowan.day21_android_button;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
    }

    public void test(View v) {
        Toast.makeText(this, "Hello 早读课", Toast.LENGTH_SHORT).show();
    }
}
