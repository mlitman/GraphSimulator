package awesomefat.com.graphsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private Graph theGraph;
    private EditText vertexNameET;
    private ListView vertexListView;
    private ArrayAdapter<String> itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.theGraph = new Graph();
        this.vertexNameET = (EditText)this.findViewById(R.id.vertexNameET);
        this.vertexListView = (ListView)this.findViewById(R.id.vertexListView);
        this.itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.theGraph.getVertexNames());
        this.vertexListView.setAdapter(itemsAdapter);
        this.vertexListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(position);
            }
        });
    }

    public void addVertex(View v)
    {
        this.theGraph.addVertex(this.vertexNameET.getText().toString());
        this.itemsAdapter.notifyDataSetChanged();
    }
}
