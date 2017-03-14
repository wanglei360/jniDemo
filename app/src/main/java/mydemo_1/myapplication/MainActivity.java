package mydemo_1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void but(View view) {
        String str = NativeUtils.getStr();
        Log.e("MainActivity", str);
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void but_1(View view) {
        String str = NativeUtils.getStr("我是从MainActivity进来的");
        Log.e("MainActivity", str);
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
