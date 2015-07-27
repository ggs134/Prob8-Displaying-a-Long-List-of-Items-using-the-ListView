package com.gssannonymous.www.usinglistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    String[] presidents = {
            "Dwight D. Eisenhower",
            "John F. Kennedy",
            "Lyndon B. Johnson",
            "Richard Nixon",
            "Gerald Ford",
            "Jimmy Carter",
            "Ronald Reagan",
            "George H. W. Bush",
            "Bill Clinton",
            "George W. Bush",
            "Barack Obama"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,presidents));

//        ListView lstView = getListView();
//        //lstView.setChoiceMode(ListView.CHOICE_MODE_NONE);
//        //lstView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//
//        lstView.setTextFilterEnabled(true);
//        int a=lstView.getChoiceMode();
//        Log.d("초이스모",String.valueOf(a));
    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        Toast.makeText(this, "You have selected"+presidents[position], Toast.LENGTH_SHORT).show();
    }


}
