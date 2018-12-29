package com.example.leodw.worldepth.navigation;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.leodw.worldepth.R;

public class NavigationManager {

    /**
     * Listener interface for navigation events
     */
    public interface NavigationListener {
        void onBackstackChanged();
    }

    private FragmentManager mFragmentManager;
    private NavigationListener mNavigationListener;

    /**
     * Initializes with a fragment manager
     */
    public void init(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
        mFragmentManager.addOnBackStackChangedListener(() -> {
            if (mNavigationListener != null) {
                mNavigationListener.onBackstackChanged();
            }
        });
    }

    /**
     * Displays the next fragmen
     *
     * @param fragment
     */
    private void open(Fragment fragment) {
        if (mFragmentManager != null) {
            //@formatter:off
            mFragmentManager.beginTransaction()
                    .replace(R.id.main_container, fragment)
                    .setCustomAnimations(R.anim.slide_in_left,
                            R.anim.slide_out_right,
                            R.anim.slide_in_right
                            R.anim.slide_out_left)
                    .addToBackStack(fragment.toString())
                    .commit();
            //@formatter:on
        }
    }

    /**
     * pops every fragment and starts the given fragment as a new one.
     *
     * @param fragment
     */
    private void openAsRoot(Fragment fragment) {
        popEveryFragment();
        open(fragment);
    }


    /**
     * Pops all the queued fragments
     */
    private void popEveryFragment() {
        // Clear all back stack.
        int backStackCount = mFragmentManager.getBackStackEntryCount();
        for (int i = 0; i < backStackCount; i++) {
            // Get the back stack fragment id.
            int backStackId = mFragmentManager.getBackStackEntryAt(i).getId();

            mFragmentManager.popBackStack(backStackId, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        }
    }

    /**
     * Navigates back by popping teh back stack. If there is no more items left we finish the current activity.
     *
     * @param baseActivity
     */
    public void navigateBack(Activity baseActivity) {

        if (mFragmentManager.getBackStackEntryCount() == 0) {
            // we can finish the base activity since we have no other fragments
            baseActivity.finish();
        } else {
            mFragmentManager.popBackStackImmediate();
        }


    public void startMenu1() {
        Fragment fragment = Module1Fragment.newInstance();
        openAsRoot(fragment);
    }

    public void startMenu3() {
        Fragment fragment = Module3Fragment.newInstance();
        openAsRoot(fragment);
    }

    public void startMenu2() {
        Fragment fragment = Module2Fragment.newInstance();
        openAsRoot(fragment);
    }

    public void startMenu4() {
        Fragment fragment = Module4Fragment.newInstance();
        openAsRoot(fragment);
    }

    public void startMenu5()
        Fragment fragment = Module5Fragment.newInstance();
        openAsRoot(fragment);
    }

    public void startInternalModule() {
        Fragment fragment = Module1InternalFragment.newInstance();
        open(fragment);
    }


    /**
     * @return true if the current fragment displayed is a root fragment
     */
    public boolean isRootFragmentVisible() {
        return mFragmentManager.getBackStackEntryCount() <= 1;
    }

    public NavigationListener getNavigationListener() {
        return mNavigationListener;
    }

    public void setNavigationListener(NavigationListener navigationListener) {
        mNavigationListener = navigationListener;
    }
}
