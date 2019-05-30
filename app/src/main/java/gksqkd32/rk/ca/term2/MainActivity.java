package gksqkd32.rk.ca.term2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_second;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_second = findViewById(R.id.btn_second);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);//첫 엑티비티= 처음엑티비티, 두번째 엑티비티=이동할 엑티비티
                startActivity(intent); //엑티비티 이동
            }
        });
    };


    public void myTouchListener(View target){ //터치발생시 인터넷 사이트로 이동
        Uri uri=Uri.parse("http://www.naver.com"); //광고시엔 광고페이지로 들어가게 할것
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    };
}
