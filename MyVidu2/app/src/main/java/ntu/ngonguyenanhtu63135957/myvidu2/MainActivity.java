package ntu.ngonguyenanhtu63135957.myvidu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenManHinhLogin(View v){
        Intent iLogin = new Intent(this, LoginActivity.class);
        startActivity(iLogin);
    }
}