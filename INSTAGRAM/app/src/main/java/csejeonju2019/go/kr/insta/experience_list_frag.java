package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pm10.library.CircleIndicator;


public class experience_list_frag extends Fragment
{

    int i=0;
    ViewPager viewPager1;
    ViewPager viewPager2;
    ViewPager viewPager3;
    private FirstFragment fragment1;
    private SecondFragment fragment2;
    private ThirdFragment fragment3;
    private SecondOneFragment fragment2_1;
    private SecondTwoFragment fragment2_2;
    private SecondThreeFragment fragment2_3;
    private ThirdOneFragment fragment3_1;
    private ThirdTwoFragment fragment3_2;
    private ThirdThreeFragment fragment3_3;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);
        Intent intent=new Intent(getActivity(),after_experience.class);
        startActivity(intent);

        return view;

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


    /*
    private class PagerAdapter2 extends FragmentPagerAdapter{
        public PagerAdapter2(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        public Fragment getItem(int position){
            if(position==0)
            {
                return fragment2_1;
            }else if(position==1){
                return fragment2_2;
            }else {
                return fragment2_3;
            }
        }
        public int getCount(){
            return 3;
        }

    }
    private class PagerAdapter3 extends FragmentPagerAdapter{
        public PagerAdapter3(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        public Fragment getItem(int position){
            if(position==0)
            {
                return fragment3_1;
            }else if(position==1){
                return fragment3_2;
            }else {
                return fragment3_3;
            }
        }
        public int getCount(){
            return 3;
        }

    }


     */



}



