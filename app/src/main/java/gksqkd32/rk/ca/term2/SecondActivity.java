package gksqkd32.rk.ca.term2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

   CalendarView cal;
   TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        cal=(CalendarView)findViewById(R.id.calendarView);
        text1 = (TextView)(findViewById(R.id.textView1));

        CalendarViewListener listener = new CalendarViewListener();
        cal.setOnDateChangeListener(listener);
    }

    class CalendarViewListener implements CalendarView.OnDateChangeListener {
        @Override
        public void onSelectedDayChange(CalendarView arg0, int arg1, int arg2, int arg3){
            //날짜 선택되면 onSelectedDayCange가 호출됨 연,월,일이 TextView에 나타난다.
            text1.setText(arg1 + "년 "+( arg2 + 1) + "월 "+ arg3 + "일 ");
        }
    }
}
