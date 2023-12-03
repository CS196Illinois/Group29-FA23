import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
public class CalanderView {


    public class CustomCalendarView extends LinearLayout {
        public CustomCalendarView(Context context) {
            super(context);
        }
        // ...
    }

    public void CustomCalendarView(Context context) {
        super(context);
        init(context, null);
    }

    public CustomCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public void CustomCalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super();
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        // Inflate the layout
        LayoutInflater.from(context).inflate(R.layout.custom_calendar_view, this, true);

        // Initialize the calendar view
        // ...
    }
    private void init(Context context, AttributeSet attrs) {
        // Inflate the layout
        LayoutInflater.from(context).inflate(R.layout.custom_calendar_view, this, true);

        // Initialize the calendar view
        CalendarPickerView calendarView = findViewById(R.id.calendar_view);
        Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);
        calendarView.init(new Date(), nextYear.getTime());
    }

}
