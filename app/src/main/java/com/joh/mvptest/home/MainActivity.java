package com.joh.mvptest.home;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentTransaction;

import com.joh.mvptest.R;
import com.joh.mvptest.base.BaseActivity;

public class MainActivity extends BaseActivity implements SearchView.OnQueryTextListener {

    MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MvpPresenter();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        MvpFragment fragment = new MvpFragment();
        fragment.setPresenter(presenter);
        fragmentTransaction.add(R.id.layout_fragment, fragment);
        fragmentTransaction.commit();

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        presenter.getDataChange(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
