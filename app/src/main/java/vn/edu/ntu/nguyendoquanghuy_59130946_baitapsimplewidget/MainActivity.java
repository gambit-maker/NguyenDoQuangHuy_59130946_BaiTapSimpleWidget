package vn.edu.ntu.nguyendoquanghuy_59130946_baitapsimplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    CheckBox xemPhim, ngheNhac, diCafe, oNha, nauAn;
    EditText tenCuaBan, ngaySinhCuaBan, soThichKhac;
    RadioGroup rdgGioiTinh;
    Button btnXacNhan;
    ArrayList<String> cacSoThich = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        checkSoThich();
        addEvent();
    }

    private void addViews(){
        tenCuaBan = findViewById(R.id.tenCuaBan);
        ngaySinhCuaBan = findViewById(R.id.ngaySinhCuaBan);
        soThichKhac = findViewById(R.id.soThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        btnXacNhan = findViewById(R.id.btnXacNhan);

        xemPhim = findViewById(R.id.xemPhim);
        ngheNhac = findViewById(R.id.ngheNhac);
        diCafe = findViewById(R.id.diCafe);
        oNha = findViewById(R.id.oNha);
        nauAn = findViewById(R.id.nauAn);
    }

    private void checkSoThich(){
        xemPhim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(xemPhim.isChecked()){
                    cacSoThich.add("Xem phim");
                }
                else{
                    cacSoThich.remove("Xem phim");
                }
            }
        });

        ngheNhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ngheNhac.isChecked()){
                    cacSoThich.add("Nghe nhạc");
                }
                else{
                    cacSoThich.remove("Nghe nhạc");
                }
            }
        });

        diCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(diCafe.isChecked()){
                    cacSoThich.add("Đi cà phê với bạn bè");
                }
                else{
                    cacSoThich.remove("Đi cà phê với bạn bè");
                }
            }
        });

        oNha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oNha.isChecked()){
                    cacSoThich.add("Ở nhà một mình");
                }
                else{
                    cacSoThich.remove("Ở nhà một mình");
                }
            }
        });

        nauAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nauAn.isChecked()){
                    cacSoThich.add("Vào bếp nấu ăn");
                }
                else{
                    cacSoThich.remove("Vào bếp nấu ăn");
                }
            }
        });
    }

    private void addEvent(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }

    private void showToast(){
        Toast.makeText(this, thongTinCuaBan()+"Sở thích: "+soThichCuaBan(), Toast.LENGTH_SHORT).show();
    }

    private String soThichCuaBan(){
        String soThich ="";
        for (String i:cacSoThich){
            soThich +=i+", ";
        }
        soThich += soThichKhac.getText().toString();
        return soThich;
    }

    private String thongTinCuaBan(){
        String thongTin="";
        String gioiTinh;
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rbNam:
                gioiTinh = "Nam"; break;
            case R.id.rbNu:
                gioiTinh = "Nữ"; break;
            default:
                gioiTinh = "";
        }
        thongTin +="Tên: "+ tenCuaBan.getText().toString()+"\n" +
                "Ngày sinh: "+ngaySinhCuaBan.getText().toString()+"\n" +
                "Giới tính:"+gioiTinh +"\n";

        return thongTin;
    }

}
