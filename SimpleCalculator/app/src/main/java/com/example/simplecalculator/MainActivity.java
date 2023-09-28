package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum Opeaator {none,add,minus,muliply,divide};
    private double data1=0,data2=0;
    private Opeaator opr=Opeaator.none;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn07Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("7");
        }else{
            eText.setText(eText.getText()+"7");
        }
    }
    public void btn08Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("8");
        }else{
            eText.setText(eText.getText()+"8");
        }
    }
    public void btn09Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("9");
        }else{
            eText.setText(eText.getText()+"9");
        }
    }
    public void btn04Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("4");
        }else{
            eText.setText(eText.getText()+"4");
        }
    }
    public void btn05Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("5");
        }else{
            eText.setText(eText.getText()+"5");
        }
    }
    public void btn06Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("6");
        }else{
            eText.setText(eText.getText()+"6");
        }
    }
    public void btn01Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("1");
        }else{
            eText.setText(eText.getText()+"1");
        }
    }
    public void btn02Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("2");
        }else{
            eText.setText(eText.getText()+"2");
        }
    }
    public void btn03Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("3");
        }else{
            eText.setText(eText.getText()+"3");
        }
    }
    public void btn00Click(View view){
        EditText eText= (EditText) findViewById(R.id.resultEdit);
        if(eText.getText().toString().equals("0")){
            eText.setText("0");
        }else{
            eText.setText(eText.getText()+"0");
        }

    }
    public void btnAddClick(View view) {
        opr = Opeaator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMinusClick(View view) {
        opr = Opeaator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view) {
        opr = Opeaator.divide;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMuliplyClick(View view) {
        opr = Opeaator.muliply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnClearClick(View view) {
        EditText editText=(EditText) findViewById(R.id.resultEdit);
        editText.setText("0");
    }
    public void btnDotClick(View view) {
        EditText editText=(EditText) findViewById(R.id.resultEdit);
        if (editText.getText().toString().contains(".")){

        }else{
            editText.setText(editText.getText().toString()+".");
        }

    }
    public void btnResultClick(View view) {
        if (opr!=Opeaator.none){
            EditText editText=(EditText) findViewById(R.id.resultEdit);
            data2=Double.parseDouble(editText.getText().toString());
            double result=0;
            if(opr==Opeaator.add){
                result=data1+data2;
            } else if (opr==Opeaator.minus) {
                result=data1-data2;

            }else if (opr==Opeaator.divide) {
                result = data1 / data2;
            }else if (opr==Opeaator.muliply) {
                result = data1 * data2;
            }
            opr=Opeaator.none;
            data1=result;
            if(result-(int)result!=0){
                editText.setText(String.valueOf(result));
            }else{
                editText.setText(String.valueOf((int)result));
            }

        }


    }
}