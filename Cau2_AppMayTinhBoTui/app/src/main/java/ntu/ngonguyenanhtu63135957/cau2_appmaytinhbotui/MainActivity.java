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
    private String number=null;

    double lastnumber = 0,firstnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn0 = this.findViewById(R.id.btn0);
        btn1 = this.findViewById(R.id.btn1);
        btn2 = this.findViewById(R.id.btn2);
        btn3 = this.findViewById(R.id.btn3);
        btn4 = this.findViewById(R.id.btn4);
        btn5 = this.findViewById(R.id.btn5);
        btn6 = this.findViewById(R.id.btn6);
        btn7 = this.findViewById(R.id.btn7);
        btn8 = this.findViewById(R.id.btn8);
        btn9 = this.findViewById(R.id.btn9);

        btnPlus = this.findViewById(R.id.btnPlus);
        btnSubtract = this.findViewById(R.id.btnSubtract);
        btnMultiply = this.findViewById(R.id.btnMultiply);
        btnDivide = this.findViewById(R.id.btnDivide);

        btnDot = this.findViewById(R.id.btnDot);
        btnEquals = this.findViewById(R.id.btnEquals);
        btnAC = this.findViewById(R.id.btnAC);
        btnDel = this.findViewById(R.id.btnDel);

        textViewHistory = this.findViewById(R.id.textViewHistory);
        textviewResult = this.findViewById(R.id.textviewResult);

        btn0.setOnClickListener(view -> numberclick("0"));
        btn1.setOnClickListener(view -> numberclick("1"));
        btn2.setOnClickListener(view -> numberclick("2"));
        btn3.setOnClickListener(view -> numberclick("3"));
        btn4.setOnClickListener(view -> numberclick("4"));
        btn5.setOnClickListener(view -> numberclick("5"));
        btn6.setOnClickListener(view -> numberclick("6"));
        btn7.setOnClickListener(view -> numberclick("7"));
        btn8.setOnClickListener(view -> numberclick("8"));
        btn9.setOnClickListener(view -> numberclick("9"));
    }
    public void numberclick (String view){
        if(number == null){
            number = view;
        } else{
            number = number + view;
        }
        textviewResult.setText(number);
    }
    public void Minus(){
        if(firstnumber == 0){
            firstnumber = Double.parseDouble(textViewHistory.getText().toString());
        } else  {
            lastnumber = Double.parseDouble(textviewResult.getText().toString());
            firstnumber=firstnumber-lastnumber;
            
        }
        textviewResult.setText(""+firstnumber);
    }
    public void Plus(){
        lastnumber = Double.parseDouble(textviewResult.getText().toString());
        firstnumber=firstnumber+lastnumber;
        textviewResult.setText(""+firstnumber);
    }

}