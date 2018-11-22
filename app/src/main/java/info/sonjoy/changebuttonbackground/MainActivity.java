package info.sonjoy.changebuttonbackground;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleMe(View view)
    {
        System.out.println("before b1");

        Button b1 = (Button)  findViewById(R.id.b1);

        System.out.println( b1);

        ColorDrawable viewColor = ( ColorDrawable ) b1.getBackground();

        int colorId = viewColor.getColor();

        if(colorId == Color.parseColor("#ffffff"))
        {
            viewColor.setColor(Color.parseColor("#00FFFF"));
        }
        else if(colorId == Color.parseColor("#00FFFF"))
        {
            viewColor.setColor(Color.parseColor("#0000FF"));
        }
        else
            viewColor.setColor(Color.parseColor("#ffffff"));
    }
}
