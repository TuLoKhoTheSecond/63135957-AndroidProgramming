package till.edu.ex_6_listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hien thi dl len list  view
        //B1: can co du lieu
        //ArrayList<String> dsTenTinhThanhVN; //khai bao
        dsTenTinhThanhVN = new ArrayList<>(); //Tao the hien cu the, xin moi
        //Them du lieu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Tiền Giang");

        //B2: Tao adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN);

        //B3 Gan vaoo dk hien thi ListView
        //3.1 Tim
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //Gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lang nghe va xu li su kien tuong tac
        //Gan bo lang nghe vao
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tao bo lang nghe va xu li su kien OnItemClick, dat vao 1 bien
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xu ly
            //i la vi tri pt vua dc click
            //Hien len man hinh 1 thong bao nhanh ve pt vua dc chon
            ////Lay gt cua pt thu i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: "+String.valueOf(i), Toast.LENGTH_LONG).show();
            //Toast.makeText(MainActivity.this,strTenTinhChon, Toast.LENGTH_LONG).show();

        }
    };
}