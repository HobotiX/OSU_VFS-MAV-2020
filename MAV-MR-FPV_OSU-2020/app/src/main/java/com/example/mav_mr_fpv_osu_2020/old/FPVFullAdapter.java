package com.example.mav_mr_fpv_osu_2020.old;

import android.view.TextureView;
import android.widget.FrameLayout;

import com.example.vfsmav_osu20_fpv.mavdata.MAVRepo;

public class FPVFullAdapter extends FrameLayout.Adapter<FPVFullAdapter.telemetryViewHolder> {
    private MAVRepo mTelemetry;
    private TextureView textureView;

    @Override
    protected void getItemCount() {
        setContentView(R.layout.activity_fpv_full);
        textureView = (TextureView) findViewById(R.id.textureView);
        assert textureView != null;
        textureView.setSurfaceTexture(new TextureView.SurfaceTextureListener() {

        });
    }
    public FPVFullAdapter() {

    }
}
