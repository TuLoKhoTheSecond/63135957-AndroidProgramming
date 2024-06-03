package ntu.ngonguyenanhtu63135957.baithi;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFrament = null;
                int itemId = item.getItemId();
                if(itemId == R.id.main){
                    findViewById(R.id.titleTextView).setVisibility(View.VISIBLE);
                } else {
                    // Ẩn TextView khi chọn các fragment khác
                    findViewById(R.id.titleTextView).setVisibility(View.GONE);
                }
                if (itemId == R.id.nav_home) {
                    selectedFrament = new HomeFragment();

                }
                    // Hiển thị TextView khi chọn màn hình chính (HomeFragment)
                if (itemId == R.id.nav_cau1) {
                    selectedFrament = new Cau1Fragment();
                } else if (itemId == R.id.nav_cau2) {
                    selectedFrament = new Cau2Fragment();
                } else if (itemId == R.id.nav_cau3) {
                    selectedFrament = new Cau3Fragment();
                } else if (itemId == R.id.nav_cau4) {
                    selectedFrament = new Cau4Fragment();
                }

                if (selectedFrament != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectedFrament).commit();
                }
                return true;

            }
        });
    }
}