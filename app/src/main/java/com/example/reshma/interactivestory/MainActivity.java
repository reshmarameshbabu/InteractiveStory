package com.example.reshma.interactivestory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Story mStory = new Story();
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private Page mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //EditText editText = (EditText) findViewById(R.id.); //Edittext not present in layout
        //ImageView mImageView = (ImageView) findViewById(R.id.storyImageView); //Imageview not present in layout
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mChoice1 = (Button) findViewById(R.id.choiceButton1);
        mChoice2 = (Button) findViewById(R.id.choiceButton2);

        loadPage(0);//When we launched our app it will show the story of **mPages[0]**
    }

    private void loadPage(int choice) {
        mCurrentPage = mStory.getPage(choice);

        String pageText = mCurrentPage.getmText();
        mTextView.setText(pageText);
        mChoice1.setText(mCurrentPage.getmChoice1().getmText());
        mChoice2.setText(mCurrentPage.getmChoice2().getmText());

        //Now we are setting onClickListenere For each button and replace the story with new story

        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mCurrentPage.getmChoice1().getmNextPage();//getting which next story
                loadPage(nextPage);// and replace with old story
            }
        });

        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mCurrentPage.getmChoice2().getmNextPage();
                loadPage(nextPage);
            }
        });
    }
}


