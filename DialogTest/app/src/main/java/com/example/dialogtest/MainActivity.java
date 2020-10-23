package com.example.dialogtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;
    private TextView qd;
    private  CustomDialog  dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        tv=(TextView)findViewById(R.id.tv);
        qd=(TextView)findViewById(R.id.qd);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // dialog();
                mydialog();
            }

            private void dialog() {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
               builder.setMessage("请到 PC 端工作台注册");
               builder.setCancelable(false);
              builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

              AlertDialog dialog=builder.create();


                dialog.show();

            }

            /*private void mydialog(){
               // MyDialog.Buil
                CustomDialog.Builder builder = new CustomDialog.Builder(MainActivity.this);
                 dialog =
                        builder.cancelTouchout(false)
                                .view(R.layout.my_dialog).style(R.style.Dialog)
                                .heightDimenRes(200).widthDimenRes(200)

                                .addViewOnclick(R.id.btn_cancel,new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        dialog.dismiss();
                                    }
                                })
                                .build();
                dialog.show();

            }*/
            private void mydialog(){

             //   Bitmap bitmap = xxxxx;// 这里是获取图片Bitmap，也可以传入其他参数到Dialog中
            ////    CustomPopDialog2.Builder dialogBuild = new CustomPopDialog2.Builder(MainActivity.this);
               // dialogBuild.setImage(bitmap);
                //CustomPopDialog2 dialog = dialogBuild.create();
                //dialog.setCanceledOnTouchOutside(true);// 点击外部区域关闭
                //dialog.show();
                EditNameDialogFragment editNameDialog = new EditNameDialogFragment();
                editNameDialog.show(getFragmentManager(), "EditNameDialog");
            }
        });
    }
}