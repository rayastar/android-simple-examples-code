package android.anil.com.demoencryptiondecryption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextValue;
    Button encryptButton, decryptButton;
    TextView disEncrypt, disDiscry;
    String enValue;
    String encryptedString;
    String KEY = "ABCDEFGHIJKLMNOPQRSWXYZ0123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encryptButton = findViewById(R.id.button_encryption);
        editTextValue = findViewById(R.id.editText_value);
        disEncrypt = findViewById(R.id.textView_disencry);
        disDiscry = findViewById(R.id.textView_disde);
        decryptButton = findViewById(R.id.button_discryption);
        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enValue = editTextValue.getText().toString();
                if (enValue != null && !enValue.isEmpty()) {

                    encryptedString = encryption(enValue);
                    disEncrypt.setText(encryptedString);

                } else {
                    Toast.makeText(MainActivity.this, "Please Enter value", Toast.LENGTH_SHORT).show();
                }

            }
        });
        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String decryptedString = decryption(encryptedString);
                disDiscry.setText(decryptedString);

            }
        });
    }

    public String encryption(String strNormalText) {
        String normalTextEnc = "";
        try {
            normalTextEnc = AESHelper.encrypt(KEY, strNormalText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return normalTextEnc;
    }

    public String decryption(String strEncryptedText) {
        String strDecryptedText = "";
        try {
            strDecryptedText = AESHelper.decrypt(KEY, strEncryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strDecryptedText;
    }
}

