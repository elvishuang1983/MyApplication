package tw.huang.elvis.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn,btn2;
    boolean chks[] = new boolean[25];
    boolean temp[] = new boolean[25];
    StringBuilder sb_report;
    CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7,chk8,chk9,chk10,chk11,chk12,chk13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        tv = findViewById(R.id.textView);
        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox1);
        chk3 = findViewById(R.id.checkBox2);
        chk4 = findViewById(R.id.checkBox3);
        chk5 = findViewById(R.id.checkBox4);
        chk6 = findViewById(R.id.checkBox5);
        chk7 = findViewById(R.id.checkBox6);
        chk8 = findViewById(R.id.checkBox7);
        chk9 = findViewById(R.id.checkBox8);
        chk10 = findViewById(R.id.checkBox9);
        chk11 = findViewById(R.id.checkBox10);
        chk12 = findViewById(R.id.checkBox11);
        chk13 = findViewById(R.id.checkBox12);

    }




    public void click1(View v)
    {
        Intent it = new Intent(Intent.ACTION_VIEW);
        StringBuilder sb = new StringBuilder();

        if (chk1.isChecked()) {
            sb.append("Wen.Chung.Chang@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Wen.Chung.Chang@tpv-tech.com"));
        }
        if (chk2.isChecked()) {
            sb.append("John.Chuang@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:John.Chuang@tpv-tech.com"));
        }
        if (chk3.isChecked()) {
            sb.append("Marcus.Chen@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Marcus.Chen@tpv-tech.com"));
        }
        if (chk4.isChecked()) {
            sb.append("Wayne.Wong@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Wayne.Wong@tpv-tech.com"));
        }
        if (chk5.isChecked()) {
            sb.append("Jack.Lee@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Jack.Lee@tpv-tech.com"));
        }
        if (chk6.isChecked()) {
            sb.append("Eddy.Huang@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Eddy.Huang@tpv-tech.com"));
        }
        if (chk7.isChecked()) {
            sb.append("Wilson.Tseng@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Wilson.Tseng@tpv-tech.com"));
        }
        if (chk8.isChecked()) {
            sb.append("james.dung@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:james.dung@tpv-tech.com"));
        }
        if (chk9.isChecked()) {
            sb.append("Haiwan.Huang@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Haiwan.Huang@tpv-tech.com"));
        }
        if (chk10.isChecked()) {
            sb.append("ft.yu@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:ft.yu@tpv-tech.com"));
        }
        if (chk11.isChecked()) {
            sb.append("wesley.yu@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:wesley.yu@tpv-tech.com"));
        }
        if (chk12.isChecked()) {
            sb.append("hw.huang@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:hw.huang@tpv-tech.com"));
        }
        if (chk13.isChecked()) {
            sb.append("Terry.SF.Lin@tpv-tech.com"+",");
//            it.setData(Uri.parse("mailto:Terry.SF.Lin@tpv-tech.com"));
        }
        String str = sb.toString();
        it.setData(Uri.parse("mailto:"+str));
        it.putExtra(Intent.EXTRA_SUBJECT, "尚缺報告")
        it.putExtra(Intent.EXTRA_TEXT, "尚缺以下報告\n"+ sb_report.toString());
        startActivity(it);

    }

    public void click2(View view)
    {
        final String data[] = {"ME/Layout/PCBA Test\n","DQE-HW Check list\n",
                "Image sticking\n","Power Consumption Test\n ","Remote controller (2D+A3D)\n",
                "Ambient Light Test\n","ON/OFF Power Cycling & Random On Off Test \n",
                "Brown-in / Brown-out Test \n","ELR Test\n","Stress Life Test\n","Transient Power Interruption Test\n ",
                "Power & function key Test\n","Wall Hanging Test\n","Remote controller Drop Test\n",
                "ME Resonance Test\n","Precision Test\n","Derating Test\n","Thermal test\n","Audio Electronic Test\n",
                "Acoustic Noise Test\n","Power surge\n","Tuner surge\n","Dip\n","Electric Static Discharge Test\n",
                "WiFi throughput measurement\n"};
        temp = chks.clone();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("選擇報告");
        builder.setMultiChoiceItems(data, temp, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

            }
        });
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                chks = temp.clone();
                sb_report = new StringBuilder();
                for(int i=0; i<data.length; i++)
                {
                    if(chks[i])
                    {
                        sb_report.append(data[i]);
                    }
                    else
                    {

                    }

                }

            }

        });
        builder.show();
    }

}
