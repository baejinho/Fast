package com.apphunger.baejinho.fast;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class List2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list2);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("test");
        arrayList.add("test1");
        arrayList.add("tes2");

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(adapter);


    }
}
