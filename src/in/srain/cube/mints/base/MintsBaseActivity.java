package in.srain.cube.mints.base;

import in.srain.cube.app.XActivity;
import in.srain.cube.views.ptr.demo.R;

public abstract class MintsBaseActivity extends XActivity {

    @Override
    protected String getCloseWarning() {
        return getString(R.string.cube_mints_exit_tip);
    }

    @Override
    protected int getFragmentContainerId() {
        return 0;
    }
}