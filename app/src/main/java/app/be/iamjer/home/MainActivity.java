package app.be.iamjer.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_callOwner = (Button)findViewById(R.id.btn_reportCrime);
        btn_callOwner.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callOwner(v);
            }
        });
    }

    public void callOwner(View v){
        String phone = "0498876881";
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(phoneIntent);
    }

}
