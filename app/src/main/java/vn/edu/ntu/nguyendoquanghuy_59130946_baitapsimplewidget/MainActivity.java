package vn.edu.ntu.nguyendoquanghuy_59130946_baitapsimplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

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
                System.out.println(cacSoThich);
            }
        });
    }

}
