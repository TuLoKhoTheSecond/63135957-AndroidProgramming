package ntu.ngonguyenanhtu63135957.cau2_appmaytinhbotui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnEquals,btnPlus,btnSubtract,btnMultiply,btnDivide,btnDel,btnAC;
    private TextView textViewHistory,textviewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn0 = this.findViewById(R.id.btn0);
        btn1 = this.findViewById(R.id.btn0);
        btn2 = this.findViewById(R.id.btn0);
        btn3 = this.findViewById(R.id.btn0);
        btn4 = this.findViewById(R.id.btn0);
        btn5 = this.findViewById(R.id.btn0);
        btn6 = this.findViewById(R.id.btn0);
        btn7 = this.findViewById(R.id.btn0);
        btn8 = this.findViewById(R.id.btn0);
        btn9 = this.findViewById(R.id.btn0);


    }

}