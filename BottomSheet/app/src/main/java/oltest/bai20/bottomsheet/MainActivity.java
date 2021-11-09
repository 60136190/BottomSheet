package oltest.bai20.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
//    private Button btnExpandSheet;
//    private LinearLayout layoutBottomsheet;
//    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_content_main);

            Button show = findViewById(R.id.btn_expand_sheet);
            show.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickOpenBottomSheetDialog();
                }
            });
//        btnExpandSheet = findViewById(R.id.btn_expand_sheet);
//        layoutBottomsheet = findViewById(R.id.bottom_sheet_layout);
//
//        bottomSheetBehavior = BottomSheetBehavior.from(layoutBottomsheet);
//        btnExpandSheet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED){
//                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//                }else{
//                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
//                }
//            }
//        });
    }

    private void clickOpenBottomSheetDialog() {
        View viewdialog = getLayoutInflater().inflate(R.layout.layout_bottom_sheet,null);

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(viewdialog);
        bottomSheetDialog.show();

    }
}