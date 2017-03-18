package com.example.caleb_000.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Intents
    public static final String EXTRA_MESSAGE = "com.example.caleb_000.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Send button
     * To be compatible with android::onClick method must declare:
     *      - public access
     *      - void return value
     *      - A "View" as the only parameter (it is the "View" object clicked)
     * @param   View view
     */
    public void sendMessage(View view) {
        // Intent constructor takes two parameters:
        //  - a Context as its first parameter ("this" is used because the "Activity" class is a subclass of "Context")
        //  - the Class of the app component to which the system should deliver the "intent" or activity to start
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById((R.id.editText));
        // Get text from Text Box
        String message = editText.getText().toString();
        // putExtra() add the EditText's value to the intent.
        // An Intent can carry data types as key-value pairs called extras. Your key is a public
        // constant EXTRA_MESSAGE because the next activity uses the key to retrieve the text value.
        // It's a good practice to define keys for intent extras using your app's package name as a prefix.
        // This ensures the keys are unique, in case your app interacts with other apps.
        intent.putExtra(EXTRA_MESSAGE, message);
        // The startActivity() starts an instance of the DisplayMessageActivity specified by the Intent.
        startActivity(intent);
    }
}