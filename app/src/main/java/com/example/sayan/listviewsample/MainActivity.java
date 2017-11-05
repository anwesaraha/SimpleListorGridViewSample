package com.example.sayan.listviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //list of items for array adapter of listview/gridview
    String[] listItems = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grid or list view
        GridView grid = (GridView) findViewById(R.id.listview1);
        //create array adapter with context, simple layout resource and list of items
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listItems);
        //set the adapter
        grid.setAdapter(adapter);

        //this is a different topic
        //not related to the above code
        //layout inflater is used to inflate custom layout
        //we can get layout inflater object from the context
        LayoutInflater inflater = getLayoutInflater();
        //inflate method param layout resource to be inflated and root view if any
        View rootView = inflater.inflate(R.layout.child, null);
        //we can get any view under the resource layout
        TextView textView = rootView.findViewById(R.id.text);
        //we can do general operations like onClick() against the views under the layout resource

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I am clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
