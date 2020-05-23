package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    Button btn_cong,btn_tru,btn_nhan,btn_chia,btn_result,btn_del;
    TextView textView ,textView1;
    String save_kq_num = "";
    String save_kq="";
    String num="";
    String num1="",num2 = "";
    String function ="";
    String kq ;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Numbers*/
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);

        /* Function*/
        btn_cong = (Button)findViewById(R.id.btn_cong);
        btn_tru = (Button)findViewById(R.id.btn_tru);
        btn_nhan = (Button)findViewById(R.id.btn_nhan);
        btn_chia = (Button)findViewById(R.id.btn_chia);
        btn_result = (Button)findViewById(R.id.btn_result);
        btn_del = (Button)findViewById(R.id.btn_del);
        textView = (TextView)findViewById(R.id.textView) ;
        textView1 = (TextView)findViewById(R.id.phuongthuc);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "0";
                num +="0";
                textView.setText(save_kq_num);
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "1";
                num +="1";
                textView.setText(save_kq_num);

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "2";
                num +="2";
                textView.setText(save_kq_num);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "3";
                num +="3";
                textView.setText(save_kq_num);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                save_kq_num += "4";
                num +="4";
                textView.setText(save_kq_num);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "5";
                num +="5";
                textView.setText(save_kq_num);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "6";
                num +="6";
                textView.setText(save_kq_num);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "7";
                num +="7";
                textView.setText(save_kq_num);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "8";
                num +="8";
                textView.setText(save_kq_num);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "9";
                num +="9";
                textView.setText(save_kq_num);
            }
        });
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                save_kq_num += "+";
                function = "+";
                num1 = num;
                num = "";
                textView1.setText(num1);
                textView.setText(save_kq_num);


            }
        });
        btn_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "-";
                function = "-";
                num1 = num;
                num = "";
                textView1.setText(num1);

                textView.setText(save_kq_num);

            }
        });
        btn_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "*";
                function = "*";
                num1 = num;
                num = "";
                textView1.setText(num1);
                textView.setText(save_kq_num);

            }
        });
        btn_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_kq_num += "/";
                function = "/";
                num1 = num;
                num = "";
                textView1.setText(num1);
                textView.setText(save_kq_num);


            }
        });
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2  = num;
                String num1a = num1.toString();
                String num2a = num2.toString();
                String func = function.toString();
                double x = Double.parseDouble(num1a);
                double y = Double.parseDouble(num2a);
                String strdouble="";
                double sum = 0;
                switch (func){
                    case "+":
                        sum = x+y;
                        strdouble = Double.toString(sum);
                        textView.setText(strdouble);

                        break;

                    case "-":
                        sum = x-y;
                        strdouble = Double.toString(sum);
                        textView.setText(strdouble);

                        break;
                    case "*":
                        sum = x*y;
                        strdouble = Double.toString(sum);
                        textView.setText(strdouble);

                        break;
                    case "/":
                        if(y != 0){
                            sum = x/y;
                            strdouble = Double.toString(sum);
                            textView.setText(strdouble);

                        }
                        else {
                            textView.setText("May Ngu Lam Con A");
                        }
                        break;
                    default:
                        textView.setText("An DickHead an Shit");
                }


            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");


                save_kq_num = "";
                save_kq="";
                num="";
                num1="";
                num2 = "";
                function ="";

            }
        });

    }



}