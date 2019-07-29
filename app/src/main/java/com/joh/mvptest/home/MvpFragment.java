package com.joh.mvptest.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.joh.mvptest.R;
import com.joh.mvptest.base.BaseFragment;
import com.joh.mvptest.er.ErActivity;


public class MvpFragment extends BaseFragment implements MvpView {

    TextView text;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btnAction;
    MvpPresenter presenter;

    @Override
    public int getContentViewId() {
        return R.layout.fragment_mvp;
    }

    @Override
    protected void initAllMembersView(Bundle savedInstanceState, View rootView) {
        text = (TextView) rootView.findViewById(R.id.text);
        btn1 = (Button) rootView.findViewById(R.id.btn1);
        btn2 = (Button) rootView.findViewById(R.id.btn2);
        btn3 = (Button) rootView.findViewById(R.id.btn3);
        btnAction = (Button) rootView.findViewById(R.id.btn_action);
        //初始化Presenter
//        presenter = new MvpPresenter();
//        presenter.attachView(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataForFailure();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataForError();
            }
        });
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        //断开View引用
//        presenter.detachView();
//    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    // button 点击事件调用方法
    public void getData() {
        presenter.getData("normal");
    }

    // button 点击事件调用方法
    public void getDataForFailure() {
        presenter.getData("failure");
    }

    // button 点击事件调用方法
    public void getDataForError() {
        presenter.getData("error");
    }

    //跳转
    public void action() {
        startActivity(new Intent(getActivity(), ErActivity.class));
    }

    public void setPresenter(MvpPresenter presenter) {
        this.presenter = presenter;
        this.presenter.attachView(this);
    }
}
