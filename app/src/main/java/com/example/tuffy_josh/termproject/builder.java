package com.example.tuffy_josh.termproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import  android.widget.ArrayAdapter;
import  android.widget.ListView;
import android.widget.AdapterView;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Arrays;
import  android.widget.RadioGroup;
import  android.widget.RadioButton;
import  android.widget.RadioGroup.OnCheckedChangeListener;


public class builder extends AppCompatActivity {
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    private EditText dataEntry;
    String[] items = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);


        dataEntry = (EditText)findViewById(R.id.editText);
        ListView listview = (ListView)findViewById(R.id.list);
        arrayList = new ArrayList<>(Arrays.asList(items));
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.txtitem, arrayList);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = arrayList.get(position);
                dataEntry.setText(text);
            }
        });
    }

    public void enterClicked(View v){
        String newEntry = dataEntry.getText().toString();
        arrayList.add(newEntry);
        arrayAdapter.notifyDataSetChanged();
        dataEntry.setText("");
    }

    public void deleteClicked(View v){
        String deleteEntry = dataEntry.getText().toString();
        arrayList.remove(deleteEntry);
        arrayAdapter.notifyDataSetChanged();
        dataEntry.setText("");
    }

    public void goClicked(View v){

    }
}
