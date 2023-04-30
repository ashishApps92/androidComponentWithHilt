package ashish.apps.androidcomponentwithhilt.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import ashish.apps.androidcomponentwithhilt.models.QuoteData;
import ashish.apps.androidcomponentwithhilt.network.RetroFitRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlinx.coroutines.Dispatchers;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lashish/apps/androidcomponentwithhilt/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lashish/apps/androidcomponentwithhilt/network/RetroFitRepository;", "(Lashish/apps/androidcomponentwithhilt/network/RetroFitRepository;)V", "quoteData", "Landroidx/lifecycle/LiveData;", "Lashish/apps/androidcomponentwithhilt/models/QuoteData;", "getQuoteData", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lashish/apps/androidcomponentwithhilt/network/RetroFitRepository;", "registerUser", "", "page", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ashish.apps.androidcomponentwithhilt.network.RetroFitRepository repository = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ashish.apps.androidcomponentwithhilt.network.RetroFitRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ashish.apps.androidcomponentwithhilt.network.RetroFitRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ashish.apps.androidcomponentwithhilt.models.QuoteData> getQuoteData() {
        return null;
    }
    
    public final void registerUser(int page) {
    }
}