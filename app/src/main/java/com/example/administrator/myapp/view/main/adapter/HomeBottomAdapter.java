package com.example.administrator.myapp.view.main.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.LiveBean;
import com.example.administrator.myapp.view.main.bean.MultiItem;
import com.example.administrator.myapp.view.main.bean.RecommendBean;
import com.example.administrator.myapp.view.main.bean.TeacherBean;

import java.util.ArrayList;
import java.util.List;

public class HomeBottomAdapter extends BaseMultiItemQuickAdapter<MultiItem,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public HomeBottomAdapter(List<MultiItem> data) {
        super(data);
        addItemType(MultiItem.one, R.layout.layout_live);
        addItemType(MultiItem.two, R.layout.layout_recommend);
        addItemType(MultiItem.three, R.layout.layout_column);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItem item) {
            switch (helper.getItemViewType()){
                case MultiItem.one:
                    RecyclerView rv_live = (RecyclerView) helper.getView(R.id.rv_live);
                    List<LiveBean> list1 = new ArrayList<>();
                    LiveBean liveBean1 = new LiveBean("直播中",false,"已开播37分钟","2345人在线","正义、社会性别与家庭，著名人文学者，产品设计的阶段需要严谨严肃",R.mipmap.touxiang,"金光","国内教育专家");
                    LiveBean liveBean2 = new LiveBean("直播预告",true,"今日20:00 - 21:00","2345人预约","正义、社会性别与家庭，著名人文学者，产品设计的阶段需要严谨严肃",R.mipmap.touxiang,"金光","国内教育专家");
                    LiveBean liveBean3 = new LiveBean("直播结束",true,"","2345人参与","正义、社会性别与家庭，著名人文学者，产品设计的阶段需要严谨严肃",R.mipmap.touxiang,"金光","国内教育专家");
                    list1.add(liveBean1);
                    list1.add(liveBean2);
                    list1.add(liveBean3);
                    LiveAdapter liveAdapter = new LiveAdapter(list1);
                    rv_live.setLayoutManager(new LinearLayoutManager(mContext));
                    rv_live.setAdapter(liveAdapter);
                    break;
                case MultiItem.two:
                    RecyclerView rv_recommend = (RecyclerView) helper.getView(R.id.rv_recommend);
                    List<RecommendBean> list2 = new ArrayList<>();
                    RecommendBean recommendBean1 = new RecommendBean("告别无趣，每个孩子都该了解的一些知识和想法","黄薇","国内教育专家","共300节","300币","120币");
                    RecommendBean recommendBean2 = new RecommendBean("正义、社会性别与家庭，著名人文和人物故事的描述","周彬","国内教育专家","共300节","","免费");
                    RecommendBean recommendBean3 = new RecommendBean("我会rap，篮球，喜欢唱歌跳舞，看我打篮球多帅，喜不喜欢我，给我一个赞吧","蔡徐坤","国内教育专家","共300节","300币","免费");
                    list2.add(recommendBean1);
                    list2.add(recommendBean2);
                    list2.add(recommendBean3);
                    rv_recommend.setLayoutManager(new LinearLayoutManager(mContext));
                    RecommendAdapter recommendAdapter = new RecommendAdapter(list2);
                    View headView = LayoutInflater.from(mContext).inflate(R.layout.layout_recommend_head,null);
                    View footView = LayoutInflater.from(mContext).inflate(R.layout.layout_recommend_foot,null);
                    recommendAdapter.addHeaderView(headView);
                    recommendAdapter.addFooterView(footView);
                    rv_recommend.setAdapter(recommendAdapter);
                    break;
                case MultiItem.three:
                    RecyclerView rv_teacher = (RecyclerView) helper.getView(R.id.rv_teacher);
                    List<TeacherBean> list3 = new ArrayList<>();
                    TeacherBean teacherBean1 = new TeacherBean("教育学会专家","卢森堡","中国国家博物馆管理人员");
                    TeacherBean teacherBean2 = new TeacherBean("国内教育专家","安森桂","中国国家博物馆管理人员，中国教育专家学会会员，历史考古人员");
                    TeacherBean teacherBean3 = new TeacherBean("教育学会专家","蔡徐坤","中国篮球协会会长，rap会长");
                    list3.add(teacherBean1);
                    list3.add(teacherBean2);
                    list3.add(teacherBean3);
                    TeacherAdapter teacherAdapter = new TeacherAdapter(list3);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
                    linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                    rv_teacher.setLayoutManager(linearLayoutManager);
                    View headView1 = LayoutInflater.from(mContext).inflate(R.layout.layout_recommend_head,null);
                    TextView tv_recommend_introduce = headView1.findViewById(R.id.tv_recommend_introduce);
                    tv_recommend_introduce.setVisibility(View.VISIBLE);
                    tv_recommend_introduce.setText("国内权威专家入驻");
//                    teacherAdapter.addHeaderView(headView1);
                    rv_teacher.setAdapter(teacherAdapter);
                    break;
            }
    }
}
