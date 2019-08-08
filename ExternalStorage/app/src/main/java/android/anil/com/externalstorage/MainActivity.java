package android.anil.com.externalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    Button save,read;
    EditText filename,textname;
    String dataDir = MyApplication.getAppContext().getApplicationInfo().dataDir + "/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        save=(Button)findViewById(R.id.button);
        read=(Button)findViewById(R.id.button2);
        filename=(EditText)findViewById(R.id.editText);
        textname=(EditText)findViewById(R.id.editText2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String filename1=filename.getText().toString();
                String data=textname.getText().toString();
                ;
                try {
                    File myFile = new File(dataDir+filename1);
                    myFile.createNewFile();
                    FileOutputStream fOut = new

                            FileOutputStream(myFile);
                    OutputStreamWriter myOutWriter = new

                            OutputStreamWriter(fOut);
                    myOutWriter.append(data);
                    myOutWriter.close();
                    fOut.close();
                    Toast.makeText(MainActivity.this, filename1+"Saved", Toast.LENGTH_SHORT).show();



                } catch (FileNotFoundException e) {e.printStackTrace();}
                catch (IOException e) {e.printStackTrace();}


            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2=filename.getText().toString();
                StringBuffer stringBuffer = new StringBuffer();
                String aDataRow = "";
                String aBuffer = "";
                try {
                    File myFile = new File(dataDir+s2);
                    FileInputStream fIn = new FileInputStream(myFile);
                    BufferedReader myReader = new BufferedReader(
                            new InputStreamReader(fIn));

                    while ((aDataRow = myReader.readLine()) != null) {
                        aBuffer += aDataRow + "\n";
                    }
                    myReader.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext

                        (),aBuffer,Toast.LENGTH_LONG).show();

            }
        });
    }
}
