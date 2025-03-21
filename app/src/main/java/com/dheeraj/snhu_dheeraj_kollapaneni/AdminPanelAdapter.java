package com.dheeraj.snhu_dheeraj_kollapaneni;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdminPanelAdapter extends FragmentStateAdapter {

    public AdminPanelAdapter(AdminPanelActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UserManagementFragment();
            case 1:
                return new PendingEventsFragment();
            case 2:
            default:
                return new EventManagementFragment();
        }
    }

    @Override
    public int getItemCount() {
        // We have 3 fragments
        return 3;
    }
}
