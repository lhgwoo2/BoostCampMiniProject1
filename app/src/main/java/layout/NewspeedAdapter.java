package layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.week1.NewspeedItem;
import com.example.week1.R;

import java.util.ArrayList;

/**
 * Created by 현기 on 2017-07-07.
 */

public class NewspeedAdapter extends RecyclerView.Adapter<NewspeedAdapter.ViewHolder>{
    Context context;
    ArrayList<NewspeedItem> timeList;

    public NewspeedAdapter(Context context, ArrayList<NewspeedItem> timeList){
        this.context = context;
        this.timeList = timeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //recycler view에 반복될 아이템 레이아웃 연결
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,null);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
       NewspeedItem item = timeList.get(position);

        holder.iv_pf.setImageResource(item.getPfImg());             // 프로필 이미지 설정
        holder.iv_image.setImageResource(item.getImage());             // 글 이미지 설정
        holder.tv_userId.setText(item.getProfil()); // 유저 이름
        holder.tv_date.setText(item.getDate()); // 작성 날짜
        holder.tv_contents.setText(item.getContents()); // 글 내용
        holder.tv_subTitle.setText(item.getSubTitle()); // 보조 소제목
        holder.tv_like_count.setText(item.getLikeNum()); // 좋아요 수
        holder.tv_writer.setText(item.getCommentNum()); // 댓글 수
        holder.tv_share.setText(item.getShareNum()); // 공유 수
    }


   // @TargetApi(Build.VERSION_CODES.JELLY_BEAN)

    @Override
    public int getItemCount() {
        return this.timeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_pf;            // 프로필 이미지
        ImageView iv_image;         //글 이미지

        TextView tv_userId;         // 유저 이름
        TextView tv_subTitle;       // 소 제목
        TextView tv_date;           // 작성 시간 및 날짜
        TextView tv_contents;       // 글 내용
        TextView tv_like_count;     // 좋아요 수
        TextView tv_share;          // 공유 수
        TextView tv_writer;         //댓글 수
        CardView cv;

        public ViewHolder(View v) {
            super(v);
            iv_pf = (ImageView) v.findViewById(R.id.iv_pf);

            tv_userId = (TextView) v.findViewById(R.id.tv_userId);
            tv_date = (TextView) v.findViewById(R.id.tv_date);
            tv_contents = (TextView) v.findViewById(R.id.tv_contents);

            iv_image = (ImageView) v.findViewById(R.id.iv_image);

            tv_subTitle = (TextView) v.findViewById(R.id.tv_subTitle);
            tv_like_count = (TextView) v.findViewById(R.id.tv_like_count);
            tv_writer = (TextView) v.findViewById(R.id.tv_writer);
            tv_share = (TextView) v.findViewById(R.id.tv_share);

            cv = (CardView) v.findViewById(R.id.cv);
        }
    }
}
