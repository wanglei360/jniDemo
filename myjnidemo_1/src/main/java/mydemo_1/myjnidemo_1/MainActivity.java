package mydemo_1.myjnidemo_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
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
}
