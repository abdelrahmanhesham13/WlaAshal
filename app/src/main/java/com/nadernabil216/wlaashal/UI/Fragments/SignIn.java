package com.nadernabil216.wlaashal.UI.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nadernabil216.wlaashal.Presenters.LoginPresenter;
import com.nadernabil216.wlaashal.R;
import com.nadernabil216.wlaashal.UI.Activities.LoginActivity;
import com.nadernabil216.wlaashal.Utils.GMethods;

/**
 * Created by NaderNabil216@gmail.com on 5/9/2018.
 */
public class SignIn extends Fragment implements View.OnClickListener {
    TextInputLayout username_layout, password_layout;
    EditText ed_username, ed_password;
    TextView tv_forget_password, tv_create_new_account;
    Button btn_login;
    LoginPresenter presenter;
    LoginActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_sign_in, container, false);
        mActivity = (LoginActivity) getActivity();
        presenter = new LoginPresenter();
        GMethods.ChangeViewFont(view);
        InitViews(view);
        return view;
    }

    private void InitViews(View view) {
        ed_username = view.findViewById(R.id.ed_user_name);
        ed_password = view.findViewById(R.id.ed_password);
        username_layout = view.findViewById(R.id.ed_user_name_layout);
        password_layout = view.findViewById(R.id.ed_password_layout);
        tv_forget_password = view.findViewById(R.id.tv_forget_password);
        tv_create_new_account = view.findViewById(R.id.tv_create_new_account);
        btn_login = view.findViewById(R.id.btn_send);

        tv_forget_password.setOnClickListener(this);
        tv_create_new_account.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    private void Checker() {
        String user_name = ed_username.getText().toString().trim();
        String password = ed_password.getText().toString().trim();

        username_layout.setError("");
        password_layout.setError("");

        if (user_name.isEmpty()) {
            username_layout.setError(getString(R.string.please_enter_username));
        } else if (password.isEmpty()) {
            password_layout.setError(getString(R.string.please_enter_password));
        } else {
            Login();
        }
    }

    private void Login() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send:
                Checker();
                break;
            case R.id.tv_create_new_account:
                mActivity.SwitchToSignUp();
                break;
            case R.id.tv_forget_password:

                break;
        }
    }
}