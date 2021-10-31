package vn.hust.edu.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView calculation, result;
    private String curr, res;
    private Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butequal, butplus, butplusminus, butminus, butce, butc, butdel, butdot, butdivide, butmulti;
    private boolean dot_inserted, operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation = (TextView) findViewById(R.id.calculation);
        result = (TextView) findViewById(R.id.result);
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        butdot = (Button) findViewById(R.id.butdot);
        butequal = (Button) findViewById(R.id.butequal);
        butplus = (Button) findViewById(R.id.butplus);
        butplusminus = (Button) findViewById(R.id.butplusminus);
        butminus = (Button) findViewById(R.id.butminus);
        butce = (Button) findViewById(R.id.butce);
        butc = (Button) findViewById(R.id.butc);
        butdel = (Button) findViewById(R.id.butdel);
        butdivide = (Button) findViewById(R.id.butdivide);
        butmulti = (Button) findViewById(R.id.butmulti);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });
        butdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curr.isEmpty()) {
                    curr = "0.";
                    dot_inserted = true;
                }
                if (dot_inserted = false) {
                    curr = curr + ".";
                    dot_inserted = true;
                }
                displayOne();
            }
        });
        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });
        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
                displayOne();
            }
        });
        butdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "៖";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        butmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "x";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        butminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "-";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        butplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        delete();
                    }
                    if (operator_inserted == false) {
                        curr = curr + "+";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });
        butequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator_inserted == true && !curr.substring(curr.length()-1, curr.length()).equals(" ")){
                    String [] tokens = curr.split(" ");
                    switch (tokens[1].charAt(0)){
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '៖':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });

    }

    public void displayOne() {
        calculation.setText(curr);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void delete() {
        if (!curr.isEmpty()) {
            if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                dot_inserted = false;
            }
            if (curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                curr = curr.substring(0, curr.length() - 3);
                operator_inserted = false;
            } else {
                curr = curr.substring(0, curr.length() - 1);
            }

        }

    }
}