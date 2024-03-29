package ntu.ngonguyenanhtu63135957.cau2_appmaytinhbotui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnEquals,btnPlus,btnSubtract,btnMultiply,btnDivide,btnDel,btnAC;
    private TextView textViewHistory,textviewResult;
    private String number=null;

    double lastnumber = 0,firstnumber = 0;
    boolean operator = false;
    String status = null;

    String pattern = "###,###,#####";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

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

        btnPlus.setOnClickListener(view -> {
            if(operator){
                if(status == "Multiply"){
                    Multiply();
                } else {
                    if (status == "Divide"){
                        Divide();
                    } else {
                        if (status == "Subtract"){
                            Subtract();
                        } else {
                            Plus();
                        }
                    }
                }
            }
            operator = false;
            number = null;
            status = "sum";
        });
        btnSubtract.setOnClickListener(view -> {
            if(operator){
                if(status == "Multiply"){
                    Multiply();
                } else {
                    if (status == "Divide"){
                        Divide();
                    } else {
                        if (status == "sum"){
                            Plus();
                        } else {
                            Subtract();
                        }
                    }
                }
            }
            operator = false;
            number = null;
            status = "Subtract";
        });
        btnMultiply.setOnClickListener(view -> {
            if(operator){
                if(status == "sum"){
                    Plus();
                } else {
                    if (status == "Divide"){
                        Divide();
                    } else {
                        if (status == "Subtract"){
                            Subtract();
                        } else {
                            Multiply();
                        }
                    }
                }
            }
            operator = false;
            number = null;
            status = "Multiply";
        });
        btnDivide.setOnClickListener(view -> {
            if(operator){
                if(status == "Multiply"){
                    Multiply();
                } else {
                    if (status == "sum"){
                        Plus();
                    } else {
                        if (status == "Subtract"){
                            Subtract();
                        } else {
                            Divide();
                        }
                    }
                }
            }
            operator = false;
            number = null;
            status = "Divide";
        });
        btnEquals.setOnClickListener(view -> {
            if(operator){
                if(status == "Multiply"){
                    Multiply();
                } else {
                    if (status == "sum"){
                        Plus();
                    } else {
                        if (status == "Subtract"){
                            Subtract();
                        } else
                            if( status == "Divide"){
                                Divide();
                        } else {
                            firstnumber = Double.parseDouble(textviewResult.getText().toString());
                        }
                    }
                }
            }
            operator = false;
        });
        btnAC.setOnClickListener(view ->{
            number = null;
            operator = false;
            textviewResult.setText("0");
            textViewHistory.setText("");
            firstnumber = 0;
            lastnumber =0;
        });
        btnDel.setOnClickListener(view ->{
            number = number.substring(0,number.length()-1);
            textviewResult.setText(number);
                });
        btnDot.setOnClickListener(view ->{
            if(number == null){
                number = "0.";
            } else {
                number = number + ".";
            }
            textviewResult.setText(number);
        });

    }
    public void numberclick (String view){
        if(number == null){
            number = view;
        } else{
            number = number + view;
        }
        textviewResult.setText(number);
        operator = true;
    }
    public void Subtract(){
        if(firstnumber == 0){
            firstnumber = Double.parseDouble(textViewHistory.getText().toString());
        } else  {
            lastnumber = Double.parseDouble(textviewResult.getText().toString());
            firstnumber=firstnumber - lastnumber;

        }
        textviewResult.setText(""+firstnumber);
    }
    public void Plus(){
        lastnumber = Double.parseDouble(textviewResult.getText().toString());
        firstnumber=firstnumber+lastnumber;
        textviewResult.setText(""+firstnumber);
    }
    public void Multiply(){
        if(firstnumber == 0){
            firstnumber = 1;
        }
        lastnumber = Double.parseDouble(textviewResult.getText().toString());
        firstnumber=firstnumber*lastnumber;
        textviewResult.setText(""+firstnumber);
    }
    public void Divide(){
        if(firstnumber == 0){
            lastnumber = Double.parseDouble(textviewResult.getText().toString());
            firstnumber = lastnumber;
        }else {
            lastnumber = Double.parseDouble(textviewResult.getText().toString());
            firstnumber = firstnumber / lastnumber;
        }
        textviewResult.setText(""+firstnumber);
    }

}