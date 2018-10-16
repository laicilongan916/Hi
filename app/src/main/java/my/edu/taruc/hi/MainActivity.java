package my.edu.taruc.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState)  // onCreate = main() function
    {
        super.onCreate(savedInstanceState);

        // set ContentView = display User Interface
        // R = resource class
        // layout = folder name
        setContentView(R.layout.activity_main);
        // linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);

    }

    // View = a class
    // view = an isntance of a class
    public void showMessage(View view)
    {
        // linking UI to program
        textViewMsg.setText("Hello, LaiciLongan");
    }

    public void clearScreen(View view)
    {
        textViewMsg.setText("");
    }
}
