package android.anil.com.AutoCompleteTextViewWithFilter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    String[] names = {"Android", "Anil", "Amazon", "Ball", "Bat", "Cat", "Cow", "Deer", "Dolphin"};
    String my_var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, names);
        act.setThreshold(0);
        act.setAdapter(arrayAdapter);
        act.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                my_var = arrayAdapter.getItem(position);
                Toast.makeText(MainActivity.this, "Name is : " + my_var, Toast.LENGTH_SHORT).show();
            }
        });

        act.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (!act.isPerformingCompletion()) {
                    boolean validator = false;
                    for (String val : names) {
                        if (val.toLowerCase().startsWith(s.toString().toLowerCase())) {
                            //  Toast.makeText(MainActivity.this, "No matches found ",  Toast.LENGTH_LONG).show();
                            validator = true;
                        }
                    }

                    if (!validator) {

                        Toast.makeText(MainActivity.this, "Search is not found", Toast.LENGTH_SHORT).show();

                    }
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }
}