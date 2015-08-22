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


public class MainActivity extends Activity{


    private ImageView view1[]=new ImageView[30];
    private int i=0;
    private int naki=0;
    private int j=27;
    private int k=0;
    private int naki_count=0;
    private int array_1[]=new int[16];
    private int array_2[]=new int[16];
    private int index_1=0;
    private int index_2=0;


    Keisan obj=new Keisan();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obj.set_String("チートイツ");


        view1[0] = (ImageView) findViewById(R.id.imageView1);
        view1[1] = (ImageView) findViewById(R.id.imageView2);
        view1[2] = (ImageView) findViewById(R.id.imageView3);
        view1[3] = (ImageView) findViewById(R.id.imageView4);
        view1[4] = (ImageView) findViewById(R.id.imageView5);
        view1[5] = (ImageView) findViewById(R.id.imageView6);
        view1[6] = (ImageView) findViewById(R.id.imageView7);
        view1[7] = (ImageView) findViewById(R.id.imageView8);
        view1[8] = (ImageView) findViewById(R.id.imageView9);
        view1[9] = (ImageView) findViewById(R.id.imageView10);
        view1[10] = (ImageView) findViewById(R.id.imageView11);
        view1[11] = (ImageView) findViewById(R.id.imageView12);
        view1[12] = (ImageView) findViewById(R.id.imageView13);
        view1[13] = (ImageView) findViewById(R.id.imageView14);
        view1[14] = (ImageView) findViewById(R.id.imageView15);
        view1[15] = (ImageView) findViewById(R.id.imageView16);
        view1[16] = (ImageView) findViewById(R.id.imageView17);
        view1[17] = (ImageView) findViewById(R.id.imageView18);
        view1[18] = (ImageView) findViewById(R.id.imageView19);
        view1[19] = (ImageView) findViewById(R.id.imageView20);
        view1[20] = (ImageView) findViewById(R.id.imageView21);
        view1[21] = (ImageView) findViewById(R.id.imageView22);
        view1[22] = (ImageView) findViewById(R.id.imageView23);
        view1[23] = (ImageView) findViewById(R.id.imageView24);
        view1[24] = (ImageView) findViewById(R.id.imageView25);
        view1[25] = (ImageView) findViewById(R.id.imageView26);
        view1[26] = (ImageView) findViewById(R.id.imageView27);
        view1[27] = (ImageView) findViewById(R.id.imageView28);
        view1[28] = (ImageView) findViewById(R.id.imageView29);
        view1[29] = (ImageView) findViewById(R.id.imageView30);


        ImageButton Button1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton Button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton Button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton Button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton Button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton Button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton Button7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton Button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton Button9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton Button10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton Button11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton Button12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton Button13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton Button14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton Button15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton Button16 = (ImageButton) findViewById(R.id.imageButton16);
        ImageButton Button17 = (ImageButton) findViewById(R.id.imageButton17);
        ImageButton Button18 = (ImageButton) findViewById(R.id.imageButton18);
        ImageButton Button19 = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton Button20 = (ImageButton) findViewById(R.id.imageButton20);
        ImageButton Button21 = (ImageButton) findViewById(R.id.imageButton21);
        ImageButton Button22 = (ImageButton) findViewById(R.id.imageButton22);
        ImageButton Button23 = (ImageButton) findViewById(R.id.imageButton23);
        ImageButton Button24 = (ImageButton) findViewById(R.id.imageButton24);
        ImageButton Button25 = (ImageButton) findViewById(R.id.imageButton25);
        ImageButton Button26 = (ImageButton) findViewById(R.id.imageButton26);
        ImageButton Button27 = (ImageButton) findViewById(R.id.imageButton27);
        ImageButton Button28 = (ImageButton) findViewById(R.id.imageButton28);
        ImageButton Button29 = (ImageButton) findViewById(R.id.imageButton29);
        ImageButton Button30 = (ImageButton) findViewById(R.id.imageButton30);
        ImageButton Button31 = (ImageButton) findViewById(R.id.imageButton31);
        ImageButton Button32 = (ImageButton) findViewById(R.id.imageButton32);
        ImageButton Button33 = (ImageButton) findViewById(R.id.imageButton33);
        ImageButton Button34 = (ImageButton) findViewById(R.id.imageButton34);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);


        final TextView textView = (TextView) findViewById(R.id.textView);


///////////////////////////////////////////////////////////////////////////
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 12) {
                    textView.setText("ポンの牌を選択してください");
                    naki = 1;
                    naki_count++;
                } else if (naki_count == 4) {
                    textView.setText("鳴きの入力は4回までです");
                } else {
                    Toast.makeText(getApplication(), "和了牌より後に牌を入力することはできません", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 12) {
                    textView.setText("チーの最初の牌を選択してください");
                    naki = 2;
                    naki_count++;
                } else if (naki_count == 4) {
                    textView.setText("鳴きの入力は4回までです");
                } else {
                    Toast.makeText(getApplication(), "和了牌より後に牌を入力することはできません", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 12) {
                    textView.setText("アンカンの牌を選択してください");
                    naki = 3;
                    naki_count++;
                } else if (naki_count == 4) {
                    textView.setText("鳴きの入力は4回までです");
                } else {
                    Toast.makeText(getApplication(), "和了牌より後に牌を入力することはできません", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 12) {
                    textView.setText("ミンカンの牌を選択してください");
                    naki = 4;
                    naki_count++;
                } else if (naki_count == 4) {
                    textView.setText("鳴きの入力は4回までです");
                } else {
                    Toast.makeText(getApplication(), "和了牌より後に牌を入力することはできません", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //delete

                if (index_1 != 0) {
                    //textView.setText(Integer.toString(array_2[index_2-1]));
                    if (array_2[index_2 - 1] <= 1) {
                        //textView.setText(Integer.toString(array_1[index_1 - 1]));

                        view1[(array_1[index_1 - 1])].setImageDrawable(null);


                        index_1--;
                        index_2--;
                        k--;
                        i--;
                    } else {
                        //textView.setText(Integer.toString(array_1[index_1 - 1]));
                        for (int i = 0; i < array_2[index_2 - 1]; i++) {
                            view1[(array_1[index_1 - 1]) + i + 1].setImageDrawable(null);

                        }
                        j = j + array_2[index_2 - 1];
                        index_1--;
                        index_2--;
                        i = i - 3;

                    }

                } else {
                    Toast.makeText(getApplication(), "牌が選択されていません", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //clear
                for (int i = 0; i < view1.length; i++) {
                    view1[i].setImageDrawable(null);
                }
                i = 0;
                j = 27;
                k = 0;
                index_1 = 0;
                index_2 = 0;
                naki_count = 0;
                textView.setText("牌をタップしてください");
                obj.hai_Clear();
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 1萬


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(0)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(0)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(0)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(0)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(0)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(0)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms1_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////  2萬


        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(1)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(1)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(1)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(1)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(1)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(1)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms2_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);

                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 3萬

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(2)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(2)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(2)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(2)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(2)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(2)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms3_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 4萬

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(3)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(3)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(3)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(3)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(3)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(3)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms4_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 5萬

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(4)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(4)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(4)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(4)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(4)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(4)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms5_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);

                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 6萬

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(5)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(5)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(5)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(5)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(5)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(5)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms6_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 7萬

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(6)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(6)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(6)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(6)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(6)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(6)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);

                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 8萬

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(7)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(6)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(7)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(7)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(7)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(7)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                    //Intent intent = new Intent();
                                                    //intent.setClassName("com.example.owner.majan", "com.example.owner.majan.MainActivity2Activity");
                                                    // intent.putExtra("key",obj);
                                                    //startActivity(intent);
                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 9萬

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(8)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(6)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(8)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(8)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(8)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(8)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ms9_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 1ピン

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(9)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(9)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(9)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(9)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(9)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(9)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps1_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 2ピン

        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(10)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(10)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(10)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(10)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(10)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(10)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps2_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 3ピン

        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(11)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(11)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(11)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(11)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(11)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(11)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps3_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 4ピン

        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(12)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(12)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(12)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(12)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(12)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(12)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps4_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 5ピン

        Button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(13)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(13)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(13)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(13)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(13)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(13)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps5_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 6ピン

        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(14)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(14)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(14)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(14)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(14)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(14)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps6_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 7ピン

        Button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(15)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(15)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(15)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(15)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(15)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(15)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 8ピン

        Button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(16)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(15)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(16)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(16)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(16)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(16)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 9ピン

        Button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(17)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(15)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(17)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(17)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(17)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(17)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ps9_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 1ソウ

        Button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(18)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(18)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(18)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(18)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(18)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(18)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss1_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 2ソウ

        Button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(19)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(19)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(19)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(19)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(19)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(19)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss2_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 3ソウ

        Button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(20)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(20)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(20)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(20)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(20)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(20)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss3_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 4ソウ

        Button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(21)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(21)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(21)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(21)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(21)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(21)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss4_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 5ソウ

        Button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(22)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(22)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(22)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(22)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(22)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(22)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss5_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 6ソウ

        Button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(23)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(23)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(23)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(23)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(23)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(23)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss6_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 7ソウ

        Button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(24)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(24)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(24)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(24)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(24)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(24)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 8ソウ

        Button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(25)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(25)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(25)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(25)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(25)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(25)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 9ソウ

        Button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(26)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        if (obj.set_Hai_Chi(26)) {
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss7_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss8_1));
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(26)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(26)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(26)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(26)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ss9_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 東

        Button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(27)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(27)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(27)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(27)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(27)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_e_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 南

        Button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(28)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(28)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(28)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(28)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(28)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_s_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 西

        Button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(29)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(29)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(29)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(29)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(29)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_w_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 北

        Button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(30)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(30)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(30)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(30)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(30)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_n_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 白

        Button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(31)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(31)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(31)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(31)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(31)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_no_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 發

        Button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(32)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(32)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(32)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(32)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(32)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_h_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 中

        Button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 13) {
                    if (naki == 1) {
                        if (obj.set_Hai_Pon(33)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));

                            j = j - 4;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 4;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 2) {
                        Toast.makeText(getApplication(), "字牌はチーできません", Toast.LENGTH_SHORT).show();


                    } else if (naki == 3) {
                        if (obj.set_Hai_Ankan(33)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            j = j - 5;
                            i = i + 3;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else if (naki == 4) {
                        if (obj.set_Hai_Minkan(33)) {
                            view1[j].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 1].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 2].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            view1[j - 3].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            j = j - 5;
                            i = i + 3;
                            naki = 0;
                            array_1[index_1] = j;
                            array_2[index_2] = 5;
                            index_1++;
                            index_2++;
                            textView.setText("牌をタップしてください");
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                            textView.setText("牌をタップしてください");
                            naki = 0;
                        }
                    } else {
                        if (obj.set_Hai(33)) {
                            view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                            k++;
                            i++;
                            if (i == 13) {
                                textView.setText("和了牌を入力してください");
                            }
                            array_1[index_1] = k - 1;
                            array_2[index_2] = 1;
                            index_1++;
                            index_2++;
                        } else {
                            Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    if (obj.set_Hai(33)) {
                        view1[k].setImageDrawable(getResources().getDrawable(R.drawable.p_ji_c_1));
                        k++;
                        i++;
                        array_1[index_1] = k - 1;
                        array_2[index_2] = 1;
                        index_1++;
                        index_2++;
                        if (obj.yaku_Hantei()) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("あがり方を選択してください")

                                    .setNegativeButton(
                                            "ロン",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(1);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);


                                                }
                                            }
                                    )

                                    .setNeutralButton(
                                            "ツモ",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //画面遷移
                                                    obj.set_Agari(2);
                                                    Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                                                    objIntent.putExtra("key", obj);
                                                    startActivity(objIntent);
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
                        } else {
                            Toast.makeText(getApplication(), "あがれる手牌ではありません", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplication(), "同じ牌の使用は4個までとなります", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
