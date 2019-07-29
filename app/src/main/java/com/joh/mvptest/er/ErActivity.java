package com.joh.mvptest.er;

import android.os.Bundle;
import android.widget.TextView;

import com.joh.mvptest.R;
import com.joh.mvptest.base.BaseActivity;

/**
 * 第二个页面
 */
public class ErActivity extends BaseActivity implements ErView {

    TextView tv;
    ErPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_er);
        tv = (TextView) findViewById(R.id.tv);
        presenter = new ErPresenter();
        presenter.attachView(this);
        presenter.getData(tv.getText().toString());
    }

    @Override
    public void showData(String data) {
        tv.setText(data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
