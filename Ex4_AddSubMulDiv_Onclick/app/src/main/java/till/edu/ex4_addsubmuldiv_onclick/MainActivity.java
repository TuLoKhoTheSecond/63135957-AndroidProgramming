package till.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    // Khai bao cac doi tuong gan voi dk tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.editSo1);
        editTextSo2 = (EditText)findViewById(R.id.editSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //XL +
    public void XuLyCong(View v){
        //Code xu li cong
        //b1. lay du lieu 2 so
        //b1.1 tim edit text so 1 va so 2

        //b1.2 lay du lieu tu 2 dk do
        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Tong = soA + soB;
        //b3 hien ket qua
        //b3.1
        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gan ket qua len dk
        editTextKQ.setText(chuoiKQ);

    }
    public void XuLyTru(View v){
        //Code xu li
        //b1. lay du lieu 2 so
        //b1.1 tim edit text so 1 va so 2
        //b1.2 lay du lieu tu 2 dk do
        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Hieu = soA - soB;
        //b3 hien ket qua
        //b3.1
        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Hieu);
        //b3.3 gan ket qua len dk
        editTextKQ.setText(chuoiKQ);

    }
    public void XuLyNhan(View v){
        //Code xu li
        //b1. lay du lieu 2 so
        //b1.1 tim edit text so 1 va so 2
        //b1.2 lay du lieu tu 2 dk do
        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Tich = soA * soB;
        //b3 hien ket qua
        //b3.1
        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tich);
        //b3.3 gan ket qua len dk
        editTextKQ.setText(chuoiKQ);

    }
    public void XuLyChia(View v){
        //Code xu li
        //b1. lay du lieu 2 so
        //b1.1 tim edit text so 1 va so 2
        //b1.2 lay du lieu tu 2 dk do
        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh toan
        float Thuong = soA / soB;
        //b3 hien ket qua
        //b3.1
        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Thuong);
        //b3.3 gan ket qua len dk
        editTextKQ.setText(chuoiKQ);

    }
}