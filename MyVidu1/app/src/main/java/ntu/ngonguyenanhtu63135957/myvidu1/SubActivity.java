package ntu.ngonguyenanhtu63135957.myvidu1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);

    }
    public void QuayVe(View v){
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        startActivity(iManHinhChinh);
    }
}