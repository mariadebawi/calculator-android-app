package com.example.revoservice.calcul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;




//RhinoAndroidHelper.enterContext()



public class MainActivity extends AppCompatActivity {

 Button btnClear ;
 TextView tvProcessor , tvResult ;
 String processor ;
 Boolean isSmallBracketOpen ;
 Button btnOne , btnTow , btnThree , btnFour , btnFive , btnSix , btnSeven , btnEight , btnNine ,btnZero ;
 Button btnMultiply , btnPlus , btnDiv , btnSous , btnPt , btnPerc  , btnBack  , btnBrackt , btnEgal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = findViewById(R.id.btn_delete);


        tvProcessor=findViewById(R.id.tv_process);
        tvResult = findViewById(R.id.tv_result);
        tvProcessor.setText("");
        tvResult.setText("");
        isSmallBracketOpen = false ;



        btnOne = findViewById(R.id.btn_one);
        btnTow = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnZero = findViewById(R.id.btn_zero);


        btnMultiply = findViewById(R.id.btn_multiply);
        btnSous = findViewById(R.id.btn_sous);
        btnDiv = findViewById(R.id.btn_div);
        btnPlus = findViewById(R.id.btn_plus);


        btnPt = findViewById(R.id.btn_pt);
        btnPerc = findViewById(R.id.btn_percentage);
        btnBack = findViewById(R.id.btn_back);

        btnBrackt = findViewById(R.id.btn_small_bracket);

        btnEgal = findViewById(R.id.btn_egal);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                  tvProcessor.setText("");
                  tvResult.setText("");
                                        }
                                    }
        );



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View view) {
                  processor = tvProcessor.getText().toString();
                  tvProcessor.setText(processor + "1");
                                      }
                                  }
        );


        btnTow.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "2");
                                      }
                                  }
        );



        btnThree.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "3");
                                      }
                                  }
        );



        btnFour.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "4");
                                      }
                                  }
        );




        btnFive.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "5");
                                      }
                                  }
        );


        btnSix.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "6");
                                      }
                                  }
        );



        btnSeven.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "7");
                                      }
                                  }
        );





        btnEight.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "8");
                                      }
                                  }
        );




        btnNine.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "9");
                                      }
                                  }
        );




        btnZero.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          processor = tvProcessor.getText().toString();
                                          tvProcessor.setText(processor + "0");
                                      }
                                  }
        );



        btnMultiply.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           processor = tvProcessor.getText().toString();
                                           tvProcessor.setText(processor + "X");
                                       }
                                   }
        );


        btnDiv.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           processor = tvProcessor.getText().toString();
                                           tvProcessor.setText(processor + "/");
                                       }
                                   }
        );




        btnSous.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           processor = tvProcessor.getText().toString();
                                           tvProcessor.setText(processor + "-");
                                       }
                                   }
        );




        btnPlus.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           processor = tvProcessor.getText().toString();
                                           tvProcessor.setText(processor + "+");
                                       }
                                   }
        );



        btnPt.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           processor = tvProcessor.getText().toString();
                                           tvProcessor.setText(processor + ".");
                                       }
                                   }
        );





        btnBack.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         processor = tvProcessor.getText().toString();
                                          if(processor.length() > 0){
                                              processor = processor.substring(0 , processor.length()-1);
                                              tvProcessor.setText(processor);
                                          }

                                     }
                                 }
        );




        btnBrackt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSmallBracketOpen){
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");

                    isSmallBracketOpen = false ;
                }

                  else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");

                    isSmallBracketOpen=true ;

                }
            }
        });

        btnPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "%");
            }
        });


        btnEgal.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         processor = tvProcessor.getText().toString();
                                         processor = processor.replaceAll("X", "*");
                                         processor = processor.replaceAll("%", "/100");
                                         Context rhino = Context.enter();
                                         rhino.setOptimizationLevel(-1);
                                         String result = "" ;
                                         try {

                                             Scriptable scope = rhino.initStandardObjects();
                                             result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();

                                         }catch (Exception e){
                                             result = "Error";
                                         }


                                         tvResult.setText(result);


                                     }
                                 }
        );




















    }
}
