package sg.lifecare.vitals2.ui.dashboard.nurse;


import java.util.List;

import sg.lifecare.data.remote.model.response.AssistsedEntityResponse;
import sg.lifecare.framework.di.PerActivity;
import sg.lifecare.vitals2.ui.base.MvpPresenter;
import sg.lifecare.vitals2.ui.base.MvpView;

@PerActivity
public interface NurseScanMvpPresenter<V extends MvpView> extends MvpPresenter<V> {

    List<AssistsedEntityResponse.Data> getNurses();


}
