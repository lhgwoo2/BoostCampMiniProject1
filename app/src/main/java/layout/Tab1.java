/*
*  Class Name : Tab1
*  Version 1.0
*  Created by 현기 on 2017.07.07
*  Description : 메인 Activity 상에서 Tab 레이아웃과 연결되어있는 1개의 Tab Fragment
*
*/

package layout;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week1.NewspeedItem;
import com.example.week1.R;

import java.util.ArrayList;

public class Tab1 extends Fragment {

    private RecyclerView rv;
    private LinearLayoutManager mLinearLayoutManager;
    private ArrayList<NewspeedItem> timeList;
    public Tab1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);     // 프레그먼트 view를 inflate를 통해 객체화한다.
        timeList = new ArrayList<>();
        mLinearLayoutManager = new LinearLayoutManager(getActivity());          // 리사이클러뷰의 프레그먼트를 연결하는 레이아웃매니저
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv = (RecyclerView) view.findViewById(R.id.tab1_recycler);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLinearLayoutManager);

        // 타임라인 데이터 생성
        makeList();

        // 카드 리스트뷰 어댑터에 연결
        NewspeedAdapter adapter = new NewspeedAdapter(getActivity(), timeList);
        Log.i("onCreate[NewspeedList]",""+timeList.size());
        rv.setAdapter(adapter);

        return view;
    }

    /*
    *  카드뷰에 뿌릴 데이터 셋.
    * */
    public void makeList(){

        // 첫번째 아이템 - 스펙업
        NewspeedItem item = new NewspeedItem();
        item.setProfil("스펙업(Specup)");
        item.setPfImg(R.drawable.ic_pf1);
        item.setDate("어제 오후 12:30");
        item.setImage(R.drawable.time_img1);
        item.setContents("#오늘의소식#취준생#3개월동안#월30만원#올해부터\n청년들이 구직활동에 더 집중할 수 있도록...");
        item.setSubTitle("올해부터 '취준생'에게 월 '30만원' 지급한다");
        item.setLikeNum("1,132명");
        item.setCommentNum("댓글 512개");
        item.setShareNum("공유 785회");
        timeList.add(item);

        // 두번째 아이템 - 인사이트
        item = new NewspeedItem();
        item.setProfil("인사이트");
        item.setDate("1시간 전");
        item.setPfImg(R.drawable.ic_pf2);
        item.setImage(R.drawable.time_img2);
        item.setContents("송중기 'SOLD', 조인성, 임주환, 이광수, 디오 'SALE'");
        item.setSubTitle("'절친'송중기 결혼 발표가 너무도 부러웠던 임주환이 올린 '웃픈사진'");
        item.setLikeNum("3,398명");
        item.setCommentNum("댓글 1241개");
        item.setShareNum("공유 7회");
        timeList.add(item);

    }




}
