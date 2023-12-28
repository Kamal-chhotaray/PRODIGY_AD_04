package com.example.tictactoegame;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

public class WinDialog extends Dialog {
    private final String message;
    private final MainActivity mainActivity;
    public WinDialog(@NonNull Context context,String message,MainActivity mainActivity) {
        super(context);
        this.message=message;
        this.mainActivity=mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.win_dialog);

        final TextView messageTxt = findViewById(R.id.messageTxt);
        final TextView startAgainBtn = findViewById(R.id.startAgainBtn);

        messageTxt.setText(message);

        startAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity.restartMatch();
                dismiss();

            }
        });
    }
}
