package com.example.owner.majan;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2Activity extends Activity {

    ImageView view1[]=new ImageView[7];
    private  int i=0;
    private int j=0;

    Keisan obj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        obj=(Keisan)getIntent().getSerializableExtra("key");








        Button Button =(Button)findViewById(R.id.button1);
        Button Button1 =(Button)findViewById(R.id.button2);
        Button Button2 =(Button)findViewById(R.id.button3);



        ImageButton button1=(ImageButton)findViewById(R.id.imageButton1);
        ImageButton button2=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton button3=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton button4=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton button5=(ImageButton)findViewById(R.id.imageButton5);
        ImageButton button6=(ImageButton)findViewById(R.id.imageButton6);
        ImageButton button7=(ImageButton)findViewById(R.id.imageButton7);
        ImageButton button8=(ImageButton)findViewById(R.id.imageButton8);
        ImageButton button9=(ImageButton)findViewById(R.id.imageButton9);
        ImageButton button10=(ImageButton)findViewById(R.id.imageButton10);
        ImageButton button11=(ImageButton)findViewById(R.id.imageButton11);
        ImageButton button12=(ImageButton)findViewById(R.id.imageButton12);
        ImageButton button13=(ImageButton)findViewById(R.id.imageButton13);
        ImageButton button14=(ImageButton)findViewById(R.id.imageButton14);
        ImageButton button15=(ImageButton)findViewById(R.id.imageButton15);
        ImageButton button16=(ImageButton)findViewById(R.id.imageButton16);
        ImageButton button17=(ImageButton)findViewById(R.id.imageButton17);
        ImageButton button18=(ImageButton)findViewById(R.id.imageButton18);
        ImageButton button19=(ImageButton)findViewById(R.id.imageButton19);
        ImageButton button20=(ImageButton)findViewById(R.id.imageButton20);
        ImageButton button21=(ImageButton)findViewById(R.id.imageButton21);
        ImageButton button22=(ImageButton)findViewById(R.id.imageButton22);
        ImageButton button23=(ImageButton)findViewById(R.id.imageButton23);
        ImageButton button24=(ImageButton)findViewById(R.id.imageButton24);
        ImageButton button25=(ImageButton)findViewById(R.id.imageButton25);
        ImageButton button26=(ImageButton)findViewById(R.id.imageButton26);
        ImageButton button27=(ImageButton)findViewById(R.id.imageButton27);
        ImageButton button28=(ImageButton)findViewById(R.id.imageButton28);
        ImageButton button29=(ImageButton)findViewById(R.id.imageButton29);
        ImageButton button30=(ImageButton)findViewById(R.id.imageButton30);
        ImageButton button31=(ImageButton)findViewById(R.id.imageButton31);
        ImageButton button32=(ImageButton)findViewById(R.id.imageButton32);
        ImageButton button33=(ImageButton)findViewById(R.id.imageButton33);
        ImageButton button34=(ImageButton)findViewById(R.id.imageButton34);








        view1[0]=(ImageView)findViewById(R.id.imageView1);
        view1[1]=(ImageView)findViewById(R.id.imageView2);
        view1[2]=(ImageView)findViewById(R.id.imageView3);
        view1[3]=(ImageView)findViewById(R.id.imageView4);
        view1[4]=(ImageView)findViewById(R.id.imageView5);
        view1[5]=(ImageView)findViewById(R.id.imageView6);
        view1[6]=(ImageView)findViewById(R.id.imageView7);



        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j>1) {
                    new AlertDialog.Builder(MainActivity2Activity.this)
                            .setMessage("OK or Cancel")

                            .setNegativeButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                            Intent objIntent = new Intent(MainActivity2Activity.this, MainActivity22Activity.class);
                                            objIntent.putExtra("key",obj);
                                            startActivity(objIntent);


                                            //Intent intent = new Intent();
                                            //intent.setClassName("com.example.owner.majan", "com.example.owner.majan.MainActivity22Activity");
                                            //startActivity(intent);
                                        }
                                    }
                            )


                            .setPositiveButton(
                                    "Cancel",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                        }
                                    }

                            )
                            .show();

                }else{
                    Toast.makeText(getApplication(), "ドラ牌の数が足りません", Toast.LENGTH_SHORT).show();

                }
            }
        });


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<view1.length;i++){
                    obj.dora_Clier();
                    view1[i].setImageDrawable(null);
                }
                i=0;
                j=0;
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){

                    view1[i-1].setImageDrawable(null);
                    i--;
                    j--;
                }else{
                    Toast.makeText(getApplication(), "牌が入力されていません", Toast.LENGTH_SHORT).show();

                }
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(0)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(1)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(2)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(3)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(4)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(5)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(6)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(7)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(8)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(9)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(10)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(11)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(12)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(13)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(14)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(15)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(16)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(17)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(18)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(19)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(20)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(21)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(22)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(23)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(24)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(25)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(26)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(27)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(28)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(29)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(30)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(31)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(32)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.set_dora(33)) {
                    view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                    i++;
                    j++;
                }else{
                    Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
}
