package com.muhammadbilal.receclerview_191073;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import com.muhammadbilal.receclerview_191073.ModelInfo.PersonInfo;
        import com.muhammadbilal.receclerview_191073.adapter.MainAdapter;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<PersonInfo> infoList=new ArrayList<>();
    MainAdapter rcva;
    RecyclerView RC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RC=findViewById(R.id.rvInfo);

        infoList.add(new PersonInfo(R.mipmap.p4,"Dasha Taran","mydasha@abc.com","20","2","Female"));
        infoList.add(new PersonInfo(R.mipmap.p6,"Random Adam","rdm@abc.com","29","5","Male"));
        infoList.add(new PersonInfo(R.mipmap.p2,"Evan Fong","vanoss@3backdot.com","29","14","Male"));
        infoList.add(new PersonInfo(R.mipmap.p1,"Adam Unknown","admUk@abc.com","38","5","Male"));
        infoList.add(new PersonInfo(R.mipmap.p3,"Sajjal Aly","sja@abc.com","24","7","Female"));
        infoList.add(new PersonInfo(R.mipmap.p5,"Saba Qamar","sbqa@abc.com","30","10","Female"));

        rcva=new MainAdapter(infoList,MainActivity.this);
        RC.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        RC.setHasFixedSize(true);
        RC.setAdapter(rcva);
    }
}