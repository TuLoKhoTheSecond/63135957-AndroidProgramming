package ntu.ngonguyenanhtu63135957.myvidu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void KiemTraDangNhap(View v){
        EditText edtUser = (EditText) findViewById(R.id.edtUserName);
        EditText edtPass = (EditText) findViewById(R.id.edtPass);
        TextView txtThongBao = (TextView) findViewById(R.id.txtThongBao);
        String user = edtUser.getText().toString();
        String pass = edtPass.getText().toString();

        if(user.equals("nnaTu") && pass.equals("123")) {
            ChuyenManHinhHome(v);
        } else {
            txtThongBao.setText("Sai tài khoản/mật khẩu. Vui lòng nhập lại!");
        }
    }

    public void ChuyenManHinhHome(View v){
        Intent iQuiz = new Intent(this, HomeActivity.class);
        startActivity(iQuiz);
    }
}