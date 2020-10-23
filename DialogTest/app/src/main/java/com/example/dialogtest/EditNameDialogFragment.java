package com.example.dialogtest;



import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class EditNameDialogFragment extends DialogFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialog_layout, container);
        return view;
    }

   /* @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();

        attributes.width = 1000;

        attributes.height = -2;

        getDialog().getWindow().setAttributes(attributes);
    }*/
   @Override
   public void onStart() {
       WindowManager.LayoutParams params = getDialog().getWindow().getAttributes();

       params.width = ViewGroup.LayoutParams.MATCH_PARENT;
      params.height=ViewGroup.LayoutParams.WRAP_CONTENT;
       getDialog().getWindow().setAttributes((WindowManager.LayoutParams) params);
       super.onStart();}


}
