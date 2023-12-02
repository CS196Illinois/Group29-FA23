import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class Events{
    Context context;
    ArrayList<Events> arrayList;

    public void EventRecyclerAdapter(Context context, ArrayList<Events> arrayList) {
       this.context = context;
       this.arrayList = arrayList;
    }
    public int getItemCount() {
        return arrayList.size();
    }
    private void deleteEvent(String event, String date, String time, SQLiteDatabase database) {
        String selection = Arrays.toString(new String[]{event, date, time});
        database.delete(DBStructure.EVENT_TINE_NAME, selection);
    }
        }