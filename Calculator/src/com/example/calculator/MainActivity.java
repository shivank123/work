package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	EditText et;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText1);
       b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button11);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button1);
        b11=(Button)findViewById(R.id.button1);
        b12=(Button)findViewById(R.id.button1);
        b13=(Button)findViewById(R.id.button1);
        b14=(Button)findViewById(R.id.button1);
        b15=(Button)findViewById(R.id.button1);
        b16=(Button)findViewById(R.id.button1);
    }
public void one(View view)
{
	if(n==1)
	{
	n=Integer.parseInt(b1.getText().toString());}
}
public void two(View view)
{
	if(n==2)
	{
	n=Integer.parseInt(b2.getText().toString());}
}
public void three(View view)
{
	if(n==3)
	{
	n=Integer.parseInt(b3.getText().toString());}
}
public void four(View view)
{
	if(n==4)
	{
	n=Integer.parseInt(b4.getText().toString());}
}
public void five(View view)
{
	if(n==5)
	{
	n=Integer.parseInt(b5.getText().toString());}
}
public void six(View view)
{
	if(n==6)
	{
	n=Integer.parseInt(b6.getText().toString());}
}
public void seven(View view)
{
	if(n==7)
	{
	n=Integer.parseInt(b7.getText().toString());}
}
public void eight(View view)
{
	

	if(n==8)
	{
	n=Integer.parseInt(b8.getText().toString());}
}
public void nine(View view)
{
    if(n==9)
	{
	n=Integer.parseInt(b9.getText().toString());}
}
public void zero(View view)
{
	if(n==0)
	{
	n=Integer.parseInt(b10.getText().toString());}
}
public void add(View view)
{
    if(n=='+')
	{
	n=Integer.parseInt(b11.getText().toString());}
}
public void sub(View view)
{
	
	if(n=='-')
	{
	n=Integer.parseInt(b12.getText().toString());}
}
public void mudulus(View view)
{
	if(n=='%')
	{
	n=Integer.parseInt(b13.getText().toString());}
}
public void divide(View view)
{
	
	if(n=='/')
	{
	n=Integer.parseInt(b14.getText().toString());}
}
public void multi(View view)
{
	if(n=='*')
	{
	n=Integer.parseInt(b15.getText().toString());}
}
public void equal(View view)
{
	if(n=='=')
	{
	n=Integer.parseInt(b16.getText().toString());}
}

}

