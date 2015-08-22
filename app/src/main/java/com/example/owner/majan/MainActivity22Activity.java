package com.example.owner.majan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity22Activity extends Activity {


    Keisan obj;
    String yaku;



    ImageView imageView[]=new ImageView[30];
    ImageView imageView1[]=new ImageView[20];
    TextView textView[]=new TextView[14];
    TextView textView1[]=new TextView[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22);

        obj=(Keisan)getIntent().getSerializableExtra("key");

        //TextView textView2=(TextView)findViewById((R.id.textView2));
        //textView2.setText(obj.get_String());

        imageView[0]=(ImageView)findViewById(R.id.imageView1);
        imageView[1]=(ImageView)findViewById(R.id.imageView2);
        imageView[2]=(ImageView)findViewById(R.id.imageView3);
        imageView[3]=(ImageView)findViewById(R.id.imageView4);
        imageView[4]=(ImageView)findViewById(R.id.imageView5);
        imageView[5]=(ImageView)findViewById(R.id.imageView6);
        imageView[6]=(ImageView)findViewById(R.id.imageView7);
        imageView[7]=(ImageView)findViewById(R.id.imageView8);
        imageView[8]=(ImageView)findViewById(R.id.imageView9);
        imageView[9]=(ImageView)findViewById(R.id.imageView10);
        imageView[10]=(ImageView)findViewById(R.id.imageView11);
        imageView[11]=(ImageView)findViewById(R.id.imageView12);
        imageView[12]=(ImageView)findViewById(R.id.imageView13);
        imageView[13]=(ImageView)findViewById(R.id.imageView14);
        imageView[14]=(ImageView)findViewById(R.id.imageView15);
        imageView[15]=(ImageView)findViewById(R.id.imageView16);
        imageView[16]=(ImageView)findViewById(R.id.imageView17);
        imageView[17]=(ImageView)findViewById(R.id.imageView18);
        imageView[18]=(ImageView)findViewById(R.id.imageView19);
        imageView[19]=(ImageView)findViewById(R.id.imageView20);
        imageView[20]=(ImageView)findViewById(R.id.imageView21);
        imageView[21]=(ImageView)findViewById(R.id.imageView22);
        imageView[22]=(ImageView)findViewById(R.id.imageView23);
        imageView[23]=(ImageView)findViewById(R.id.imageView24);
        imageView[24]=(ImageView)findViewById(R.id.imageView25);
        imageView[25]=(ImageView)findViewById(R.id.imageView26);
        imageView[26]=(ImageView)findViewById(R.id.imageView27);
        imageView[27]=(ImageView)findViewById(R.id.imageView28);
        imageView[28]=(ImageView)findViewById(R.id.imageView29);
        imageView[29]=(ImageView)findViewById(R.id.imageView30);



        imageView1[0]=(ImageView)findViewById(R.id.imageView31);
        imageView1[1]=(ImageView)findViewById(R.id.imageView32);
        imageView1[2]=(ImageView)findViewById(R.id.imageView33);
        imageView1[3]=(ImageView)findViewById(R.id.imageView34);
        imageView1[4]=(ImageView)findViewById(R.id.imageView35);
        imageView1[5]=(ImageView)findViewById(R.id.imageView36);
        imageView1[6]=(ImageView)findViewById(R.id.imageView37);
        imageView1[7]=(ImageView)findViewById(R.id.imageView38);
        imageView1[8]=(ImageView)findViewById(R.id.imageView39);
        imageView1[9]=(ImageView)findViewById(R.id.imageView40);
        imageView1[10]=(ImageView)findViewById(R.id.imageView41);
        imageView1[11]=(ImageView)findViewById(R.id.imageView42);
        imageView1[12]=(ImageView)findViewById(R.id.imageView43);
        imageView1[13]=(ImageView)findViewById(R.id.imageView44);
        imageView1[14]=(ImageView)findViewById(R.id.imageView45);
        imageView1[15]=(ImageView)findViewById(R.id.imageView46);
        imageView1[16]=(ImageView)findViewById(R.id.imageView47);
        imageView1[17]=(ImageView)findViewById(R.id.imageView48);
        imageView1[18]=(ImageView)findViewById(R.id.imageView49);
        imageView1[19]=(ImageView)findViewById(R.id.imageView50);





        textView[0]=(TextView)findViewById(R.id.textView2);
        textView[1]=(TextView)findViewById(R.id.textView3);
        textView[2]=(TextView)findViewById(R.id.textView4);
        textView[3]=(TextView)findViewById(R.id.textView5);
        textView[4]=(TextView)findViewById(R.id.textView6);
        textView[5]=(TextView)findViewById(R.id.textView9);
        textView[6]=(TextView)findViewById(R.id.textView10);
        textView[7]=(TextView)findViewById(R.id.textView11);
        textView[8]=(TextView)findViewById(R.id.textView12);
        textView[9]=(TextView)findViewById(R.id.textView13);
        textView[10]=(TextView)findViewById(R.id.textView14);
        textView[11]=(TextView)findViewById(R.id.textView15);
        textView[12]=(TextView)findViewById(R.id.textView16);
        textView[13]=(TextView)findViewById(R.id.textView17);


        textView1[0]=(TextView)findViewById(R.id.textView8);
        textView1[1]=(TextView)findViewById(R.id.textView7);















        show_Hai();
        show_Yaku();
        show_Tensu();


        Spinner Spineer1=(Spinner) findViewById(R.id.spinner);

        String labels1[] =getResources().getStringArray(R.array.item_label1);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels1);


        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer1.setAdapter(adapter1);

        Spineer1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner Spineer2=(Spinner) findViewById(R.id.spinner2);

        String labels2[] =getResources().getStringArray(R.array.item_label2);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels2);


        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer2.setAdapter(adapter2);

        Spineer2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner Spineer3=(Spinner) findViewById(R.id.spinner3);

        String labels3[] =getResources().getStringArray(R.array.item_label3);

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels3);


        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer3.setAdapter(adapter3);

        Spineer3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        Spinner Spineer4=(Spinner) findViewById(R.id.spinner4);

        String labels4[] =getResources().getStringArray(R.array.item_label4);

        ArrayAdapter<String> adapter4=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels4);


        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer4.setAdapter(adapter4);

        Spineer4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Spinner Spineer5=(Spinner) findViewById(R.id.spinner5);

        String labels5[] =getResources().getStringArray(R.array.item_label5);

        ArrayAdapter<String> adapter5=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels5);


        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer5.setAdapter(adapter5);

        Spineer5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner Spineer6=(Spinner) findViewById(R.id.spinner6);

        String labels6[] =getResources().getStringArray(R.array.item_label6);

        ArrayAdapter<String> adapter6=new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,labels6);


        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spineer6.setAdapter(adapter6);

        Spineer6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity22, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void show_Hai(){
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int n=0;
        int x=0;
        int y=27;
        int Hai1[];
        int Dora[];
        Dora=obj.get_Dora();
        Hai1=obj.get_Hai1();
        int Pon_index[];
        Pon_index=obj.get_Pon_index();
        int Chi_index[];
        Chi_index=obj.get_Chi_index();
        int Ankan_index[];
        Ankan_index=obj.get_Ankan_index();
        int Minkan_index[];
        Minkan_index=obj.get_Minkan_index();

        while(i< Hai1.length){
            if(Hai1[i]!=-1) {
                if (i == Pon_index[j]) {
                    switch (Hai1[i]) {

                        case 0: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 1: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));

                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }

                        case 2: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 3: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 4:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 5:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 6:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 7:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 8:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 9:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 10:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 11:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 12:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 13:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 14:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 15:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 16:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 17:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 18:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 19:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 20:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 21:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 22:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 23:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 24:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 25:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 26:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 27:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 28:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 29:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 30:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 31:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 32:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 33:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }

                        default: {
                            i++;
                            break;
                        }


                    }

                    j++;

                } else if (i == Chi_index[k]) {
                    switch (Hai1[i]) {

                        case 0: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 1: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }

                        case 2: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 3: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 4:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 5:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 6:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 7:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 8:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 9:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 10:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 11:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 12:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 13:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 14:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 15:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 16:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 17:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 18:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 19:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 20:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 21:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 22:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 23:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 24:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 25:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }
                        case 26:{
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 3;
                            break;
                        }

                        default: {
                            i++;
                            break;
                        }

                    }
                    k++;


                } else if (i == Ankan_index[l]) {
                    switch (Hai1[i]) {

                        case 0: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 1: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }

                        case 2: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 3: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 4: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 5: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 6: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 7: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 8: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 9: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 10: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 11: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 12: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 13: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 14: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 15: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 16: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 17: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 18: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 19: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 20: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 21: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 22: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 23: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 24: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 25: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 26: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 27: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 28: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 29: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 30: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 31: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 32: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 33: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        default: {
                            i++;
                            break;
                        }

                    }
                    l++;


                } else if (i == Minkan_index[n]) {
                    switch (Hai1[i]) {

                        case 0: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 1: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }

                        case 2: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 3: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 4: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 5: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 6: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 7: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 8: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 9: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 10: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 11: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 12: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 13: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 14: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 15: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 16: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 17: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 18: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 19: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 20: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 21: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 22: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 23: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 24: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 25: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 26: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 27: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 28: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 29: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 30: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 31: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 32: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        case 33: {
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y--;
                            imageView[y].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            y = y - 2;
                            i = i + 4;
                            break;
                        }
                        default: {
                            i++;
                            break;
                        }

                    }
                    n++;

                } else {
                    switch (Hai1[i]) {

                        case 0: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            x++;
                            i++;
                            break;
                        }
                        case 1: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            x++;
                            i++;
                            break;
                        }

                        case 2: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            x++;
                            i++;
                            break;
                        }
                        case 3: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            x++;
                            i++;
                            break;
                        }
                        case 4: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            x++;
                            i++;
                            break;
                        }
                        case 5: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            x++;
                            i++;
                            break;
                        }
                        case 6: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            x++;
                            i++;
                            break;
                        }
                        case 7: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            x++;
                            i++;
                            break;
                        }
                        case 8: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            x++;
                            i++;
                            break;
                        }
                        case 9: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            x++;
                            i++;
                            break;
                        }
                        case 10: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            x++;
                            i++;
                            break;
                        }
                        case 11: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            x++;
                            i++;
                            break;
                        }
                        case 12: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            x++;
                            i++;
                            break;
                        }
                        case 13: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            x++;
                            i++;
                            break;
                        }
                        case 14: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            x++;
                            i++;
                            break;
                        }
                        case 15: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            x++;
                            i++;
                            break;
                        }
                        case 16: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            x++;
                            i++;
                            break;
                        }
                        case 17: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            x++;
                            i++;
                            break;
                        }
                        case 18: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            x++;
                            i++;
                            break;
                        }
                        case 19: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            x++;
                            i++;
                            break;
                        }
                        case 20: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            x++;
                            i++;
                            break;
                        }
                        case 21: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            x++;
                            i++;
                            break;
                        }
                        case 22: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            x++;
                            i++;
                            break;
                        }
                        case 23: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            x++;
                            i++;
                            break;
                        }
                        case 24: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            x++;
                            i++;
                            break;
                        }
                        case 25: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            x++;
                            i++;
                            break;
                        }
                        case 26: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            x++;
                            i++;
                            break;
                        }
                        case 27: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            x++;
                            i++;
                            break;
                        }
                        case 28: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            x++;
                            i++;
                            break;
                        }
                        case 29: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            x++;
                            i++;
                            break;
                        }
                        case 30: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            x++;
                            i++;
                            break;
                        }
                        case 31: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            x++;
                            i++;
                            break;
                        }
                        case 32: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            x++;
                            i++;
                            break;
                        }
                        case 33: {
                            imageView[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            x++;
                            i++;
                            break;
                        }
                        default: {
                            i++;
                            break;
                        }

                    }
                }
            }else{
                i++;
            }
        }

        i=0;
        x=0;
        while(i< Dora.length) {
            if (Dora[i] != -1) {
                switch (Dora[i]) {

                    case 0: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                        x++;
                        i++;
                        break;
                    }
                    case 1: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                        x++;
                        i++;
                        break;
                    }

                    case 2: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                        x++;
                        i++;
                        break;
                    }
                    case 3: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                        x++;
                        i++;
                        break;
                    }
                    case 4: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                        x++;
                        i++;
                        break;
                    }
                    case 5: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                        x++;
                        i++;
                        break;
                    }
                    case 6: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                        x++;
                        i++;
                        break;
                    }
                    case 7: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                        x++;
                        i++;
                        break;
                    }
                    case 8: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                        x++;
                        i++;
                        break;
                    }
                    case 9: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                        x++;
                        i++;
                        break;
                    }
                    case 10: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                        x++;
                        i++;
                        break;
                    }
                    case 11: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                        x++;
                        i++;
                        break;
                    }
                    case 12: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                        x++;
                        i++;
                        break;
                    }
                    case 13: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                        x++;
                        i++;
                        break;
                    }
                    case 14: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                        x++;
                        i++;
                        break;
                    }
                    case 15: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                        x++;
                        i++;
                        break;
                    }
                    case 16: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                        x++;
                        i++;
                        break;
                    }
                    case 17: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                        x++;
                        i++;
                        break;
                    }
                    case 18: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                        x++;
                        i++;
                        break;
                    }
                    case 19: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                        x++;
                        i++;
                        break;
                    }
                    case 20: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                        x++;
                        i++;
                        break;
                    }
                    case 21: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                        x++;
                        i++;
                        break;
                    }
                    case 22: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                        x++;
                        i++;
                        break;
                    }
                    case 23: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                        x++;
                        i++;
                        break;
                    }
                    case 24: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                        x++;
                        i++;
                        break;
                    }
                    case 25: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                        x++;
                        i++;
                        break;
                    }
                    case 26: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                        x++;
                        i++;
                        break;
                    }
                    case 27: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                        x++;
                        i++;
                        break;
                    }
                    case 28: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                        x++;
                        i++;
                        break;
                    }
                    case 29: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                        x++;
                        i++;
                        break;
                    }
                    case 30: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                        x++;
                        i++;
                        break;
                    }
                    case 31: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                        x++;
                        i++;
                        break;
                    }
                    case 32: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                        x++;
                        i++;
                        break;
                    }
                    case 33: {
                        imageView1[x].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                        x++;
                        i++;
                        break;
                    }
                    default: {
                        i++;
                        break;
                    }

                }

            }else{
                i++;
            }
        }
    }

    public void show_Yaku(){

        String yaku[]=new String[14];
        yaku=obj.Get_yaku();
        for(int i=0;i<yaku.length;i++){
            textView[i].setText(yaku[i]);
        }

    }

    public void show_Tensu(){

        String tensu[]=new String[2];
        tensu=obj.Get_tensu();

        for(int i=0;i<tensu.length;i++){
            textView1[i].setText(tensu[i]);
        }
    }


}
