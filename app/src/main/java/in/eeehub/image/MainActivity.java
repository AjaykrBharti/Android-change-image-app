package in.eeehub.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.image_two);

        TextView textView = findViewById(R.id.text_view);
        textView.setText("Boy Image");

    }
}
