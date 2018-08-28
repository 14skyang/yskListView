package com.ysklistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SideBar sideBar;
    private ArrayList<User> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
        sideBar = (SideBar) findViewById(R.id.side_bar);
        sideBar.setOnStrSelectCallBack(new SideBar.ISideBarSelectCallBack() {
            @Override
            public void onSelectStr(int index, String selectStr) {
                for (int i = 0; i < list.size(); i++) {
                    if (selectStr.equalsIgnoreCase(list.get(i).getFirstLetter())) {
                        listView.setSelection(i); // 选择到首字母出现的位置
                        return;
                    }
                }
            }
        });
    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new User("阮洲"));
        list.add(new User("大娃"));
        list.add(new User("二娃"));
        list.add(new User("三娃"));
        list.add(new User("四娃"));
        list.add(new User("五娃"));
        list.add(new User("六娃"));
        list.add(new User("七娃"));
        list.add(new User("喜羊羊"));
        list.add(new User("美羊羊"));
        list.add(new User("懒羊羊"));
        list.add(new User("沸羊羊"));
        list.add(new User("暖羊羊"));
        list.add(new User("慢羊羊"));
        list.add(new User("灰太狼"));
        list.add(new User("红太狼"));
        list.add(new User("孙悟空"));
        list.add(new User("黑猫警长"));
        list.add(new User("舒克"));
        list.add(new User("贝塔"));
        list.add(new User("海尔"));
        list.add(new User("阿凡提"));
        list.add(new User("王一喆"));
        list.add(new User("哪吒"));
        list.add(new User("谢善奇"));
        list.add(new User("张天逸"));
        list.add(new User("王敬勋"));
        list.add(new User("刘超"));
        list.add(new User("罗朝阳"));
        list.add(new User("张越筹"));
        list.add(new User("肖利清"));
        list.add(new User("淘气"));
        list.add(new User("叶峰"));
        list.add(new User("楚天歌"));
        list.add(new User("江流儿"));
        list.add(new User("Tom"));
        list.add(new User("Jerry"));
        list.add(new User("12345"));
        list.add(new User("54321"));
        list.add(new User("_(:з」∠)_"));
        list.add(new User("……%￥#￥%#"));
        Collections.sort(list); // 对list进行排序，需要让User实现Comparable接口重写compareTo方法
        SortAdapter adapter = new SortAdapter(this,list);
        listView.setAdapter(adapter);
    }
}
