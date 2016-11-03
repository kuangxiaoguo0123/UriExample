package com.asiatravel.uristudy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "TAG";
    public static final String URI_ADDRESS = "http://www.java2s.com:8080/yourpath/fileName.html?stove=10&path=32&id#harvic";
    public static final String PARSE_STRING = "qijian://test.uri.activity?action=1";
    public static final String INTENT_TAG = "android.qijian.schemeurl.activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    public void startActivity(View view) {
        useUriStartActivity();
    }

    private void useUriStartActivity() {
        Uri mUri = Uri.parse(PARSE_STRING);
        Intent intent = new Intent(INTENT_TAG);
        intent.setData(mUri);
        startActivity(intent);
    }

    private void test() {
        String mUriStr = URI_ADDRESS;
        Uri mUri = Uri.parse(mUriStr);
        List<String> pathSegments = mUri.getPathSegments();

        String scheme = mUri.getScheme();
        Log.d(TAG, "test: scheme-->" + scheme);

        String authority = mUri.getAuthority();
        Log.d(TAG, "test: authority-->" + authority);

        String path = mUri.getPath();
        Log.d(TAG, "test: path-->" + path);

        String query = mUri.getQuery();
        Log.d(TAG, "test: query-->" + query);

        String fragment = mUri.getFragment();
        Log.d(TAG, "test: fragment-->" + fragment);

        for (String pathSegment : pathSegments) {
//            Log.d(TAG, "test: pathSegItem-->" + pathSegment);
        }
//        Log.d(TAG, "getQueryParameter(\"stove\"):" + mUri.getQueryParameter("stove"));
//        Log.d(TAG, "getQueryParameter(\"id\"):" + mUri.getQueryParameter("id"));
    }

}
