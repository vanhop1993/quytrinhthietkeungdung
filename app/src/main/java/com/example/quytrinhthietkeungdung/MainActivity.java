package com.example.quytrinhthietkeungdung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // khởi tạo 1 đối tượng
    TextView hoten;
    // hàm chạy đầu tiên khi vừa chạy ứng dụng lên
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* cách 1: viết tất cả trong hàm onCreate
        // kết nối trong file java vs xml
        hoten = (TextView)findViewById(R.id.textView);

        //viết code.
        hoten.setText("dau van hop \n 1993");// truyền vào kiểu chuỗi dau van hop 1993*/
       init();
    }

    // cách 2: hàm khỏi tạo dùng để kết nối ứng dụng
    public void init(){
        hoten.setText("dau van hop \n 1993");
    }
}